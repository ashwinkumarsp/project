package gas_pump;

import strategy.SetPrice2;
import mda_efsm.MDAEFSM;
import data_store.DataStore;
import data_store.DataStore1;
import data_store.DataStore2;

public class GasPump2 
{
	MDAEFSM mdaefsm = null;
	DataStore datastore = null;
	SetPrice2 sp2;
	
	public GasPump2 (MDAEFSM mdaefsm, DataStore dataStore) 
	{
		this.mdaefsm = mdaefsm;
		this.datastore = dataStore;
		this.Activate(((DataStore2)dataStore).temp_a, ((DataStore2)dataStore).temp_b);
	}
	

	
	public void Activate(float a, float b)
	{
		if (a>0 && b>0) 
		{
			((DataStore2)datastore).temp_a = a;
			((DataStore2)datastore).temp_b = b;
			((DataStore2)datastore).flag = 2;
	    	mdaefsm.activate();
		}
	}
	
	public void Start ()
	{
		mdaefsm.Start();
	}
	
	public void PayCredit()
	{
		mdaefsm.PayCredit();
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
	
	public void Super()
	{
		mdaefsm.SelectGas(2);
		//((DataStore2)datastore).flag = 2; //delete
		sp2.SetPrice(1);
		
	}
	
	public void Regular()
	{
		mdaefsm.SelectGas(1);
		//((DataStore2)datastore).flag = 1;// delete
		sp2.SetPrice(0);
	}
	
	public void StartPump()
	{
		mdaefsm.StartPump();
		
	}
	
	public void PumpGallon()
	{
		 mdaefsm.Pump();
	}
	
	public void StopPump()
	{
		mdaefsm.StopPump();
		mdaefsm.Receipt();
	}
}
