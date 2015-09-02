package gas_pump;

import strategy.SetPrice3;
import strategy.StoreCash3;
import mda_efsm.MDAEFSM;
import data_store.DataStore;
import data_store.DataStore1;
import data_store.DataStore2;
import data_store.DataStore3;

public class GasPump3 {
	
	MDAEFSM mdaefsm = null;
	DataStore datastore = null;
	SetPrice3 sp3 ;
	
	public GasPump3 (MDAEFSM mdaefsm, DataStore dataStore) 
	{
		this.mdaefsm = mdaefsm;
		this.datastore = dataStore;
		this.Activate(((DataStore3)dataStore).temp_a, ((DataStore3)dataStore).temp_b);
	}
	
	
	public void Activate(float a, float b)
	{
		if (a>0 && b>0) 
		{
			((DataStore3)datastore).temp_a = a;
			((DataStore3)datastore).temp_b = b;
			((DataStore3)datastore).flag = 2;
	    	mdaefsm.activate();
		}
	}
	
	public void Start ()
	{
		mdaefsm.Start();
	}
	
	public void PayCash(float c)
	{
		//StoreCash3 st3 = null;
		if(c>0)
		{
			//st3.StoreCash(c);
			((DataStore3)datastore).cash = c;
			mdaefsm.PayCash();
		}
		
	}
	
	
	public void Cancel()
	{
		mdaefsm.Cancel();
	}
	
	
	public void Premium()
	{
		mdaefsm.SelectGas(2);
		sp3.SetPrice(1);
		//((DataStore3)datastore).flag = 2;
	}
	
	public void Regular()
	{
		mdaefsm.SelectGas(1);
		sp3.SetPrice(0);
		//((DataStore3)datastore).flag = 1;
	}
	
	public void StartPump()
	{
		mdaefsm.StartPump();
		
	}
	
	public void PumpLiter()
	{
		if ( ((DataStore3)datastore).cash < (((DataStore3)datastore).L+1) * ((DataStore1)datastore).price  )
		{
			mdaefsm.StopPump();
		}
		else mdaefsm.Pump();
	}
	
	public void StopPump()
	{
		mdaefsm.StopPump();
	}

	public void Receipt()
	{
		mdaefsm.Receipt();
	}
	
	public void NoReceipt()
	{
		mdaefsm.NoReceipt();
	}

}
