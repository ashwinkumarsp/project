package gas_pump;

import strategy.SetW1;
import strategy.StoreCash1;
import strategy.StoreData1;
import data_store.DataStore;
import data_store.DataStore1;
import data_store.DataStore2;
import mda_efsm.MDAEFSM;

public class GasPump1 
{
	MDAEFSM mdaefsm = null;
	DataStore datastore = null;
	
	public GasPump1 (MDAEFSM mdaefsm, DataStore dataStore) 
	{
		this.mdaefsm = mdaefsm;
		this.datastore = dataStore;
		this.Activate(((DataStore1)dataStore).temp_a);
	}
	
	
	
	public void Activate(int a)
	{
		//StoreData1 sd1 = null;
		if (a>0) 
		{
			((DataStore1)datastore).temp_a = a;
			//sd1.StoreData(a);//
			((DataStore1)datastore).flag = 1;
	    	mdaefsm.activate();
		}
	}
	
	public void Start ()
	{
		mdaefsm.Start();
	}
	
	public void PayCredit()
	{
		//SetW1 w = new SetW1();
		mdaefsm.PayCredit();
		((DataStore1)datastore).temp_w = 1;
	}
	
	public void Reject()
	{
		mdaefsm.Reject();
		
	}
	
	public void Cancel()
	{
		mdaefsm.Cancel();
	}
	
	public void Approved()
	{
		mdaefsm.Approved();
	}
	
	public void PayCash(int c)
	{
		//SetW1 w = new SetW1() ;
		//StoreCash1 st = null;
		if (c>0) {
			//st.StoreCash(c);
			((DataStore1)datastore).cash = c;
			//w.SetW(0);
			((DataStore1)datastore).temp_w = 0;
			mdaefsm.PayCash();
			}
	}
	
	public void StartPump()
	{
		mdaefsm.SelectGas(1);
		mdaefsm.StartPump();
		
	}
	
	public void PumpGallon()
	{
		if ( ((((DataStore1)datastore).temp_w ==1) || (((DataStore1)datastore).temp_w ==0)) && (((DataStore1)datastore).cash >= ((((DataStore1)datastore).G+1) * ((DataStore1)datastore).price))  )
		{
			mdaefsm.Pump();
		}
		
		else if( (((DataStore1)datastore).temp_w ==0) && (((DataStore1)datastore).cash < ((((DataStore1)datastore).G+1) * ((DataStore1)datastore).price)) )
		{
			mdaefsm.Receipt();
		}
		
		
//		if (((DataStore1)datastore).temp_w ==1)
//			mdaefsm.Pump();
//		else if (((DataStore1)datastore).temp_w == 0)
//		{
//			if ( ((DataStore1)datastore).cash < ((((DataStore1)datastore).G+1) * ((DataStore1)datastore).price)  )
//			{
//				mdaefsm.StopPump();
//				mdaefsm.Receipt();
//			}
//			else 
//				{
//				mdaefsm.Pump();
//				}
//		}
	}
	
	public void StopPump()
	{
		mdaefsm.StopPump();
		mdaefsm.Receipt();
	}

}
