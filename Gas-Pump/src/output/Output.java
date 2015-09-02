package output;

import strategy.*;
import data_store.*;
import abstract_factory.AbstractFactory;



public class Output {
	AbstractFactory factory =null;
	DataStore dataStore = null;
	DataStore dataStore1 = null;
	
	public Output(AbstractFactory factory,DataStore dataStore) 
	{
        this.factory = factory;
        this.dataStore = dataStore;
    }

	
	public void StoreData()
	{
		System.out.println("\n OUTPUT:: Action StoreData");
		StoreData storedata = factory.CreateStoreData();
		if(((DataStore1)dataStore).flag==1)
		{
			storedata.StoreData(dataStore);
		}
		
		else if(((DataStore2)dataStore).flag==2 || ((DataStore3)dataStore).flag==2  )
		{
			storedata.StoreData(dataStore, dataStore1);
		}
		
		
		
	}
	
	public void Pay_Msg()
	{
		System.out.println("\n OUTPUT:: Action Pay_Msg");
		PayMsg pm = factory.CreatePayMsg();
		pm.PayMsg();
	}
	
	public void StoreCash()
	{
		System.out.println("\n OUTPUT:: Action StoreCash");
		StoreCash Sc = factory.CreateStoreCash();
		Sc.StoreCash(dataStore);
	}
	
	public void DisplayMenu()
	{
		System.out.println("\n OUTPUT:: Action DisplayMenu");
		DisplayMenu dm = factory.CreateDisplayMenu();
		dm.DisplayMenu();
	}
	
	public void RejectMsg()
	{
		System.out.println("\n OUTPUT:: Action RejectMsg");
		RejectMsg Rm = factory.CreateRejectMsg();
		Rm.RejectMsg();
	}
	
	public void SetW(int k)
	{
		System.out.println("\n OUTPUT:: Action SetW");
		SetW Sw = factory.CreateSetW(k);
		Sw.SetW(dataStore);
	}
	
	public void SetPrice(int g)
	{
		System.out.println("\n OUTPUT:: Action SetPrice ");
		SetPrice Sp = factory.CreateSetPrice(g);
		Sp.SetPrice(g);
	}
	
	public void ReadyMsg()
	{
		System.out.println("\n OUTPUT:: Action ReadyMsg ");
		ReadyMsg Rm = factory.CreateReadyMsg();
		Rm.ReadyMsg();
	}
	
	public void SetInitialValues()
	{
		System.out.println("\n OUTPUT:: Action SetInitialValues ");
		SetInitialValues Si = factory.CreateSetIntialValues();
		Si.SetInitialValues(dataStore);
	}
	
	public void PumpGasUnit()
	{
		System.out.println("\n OUTPUT:: Action PumpGasUnit  ");
		PumpGasUnit Pgu = factory.CreatePumpGasUnit();
		Pgu.PumpGasUnit(dataStore);
	}
	
	public void GasPumpedMsg()
	{
		System.out.println("\n OUTPUT:: Action GasPumpedMsg  ");
		GasPumpedMsg Gpm = factory.CreateGasPumpedmsg();
		Gpm.GasPumpedMsg(dataStore);
	}
	public void StopMsg()
	{
		System.out.println("\n OUTPUT:: Action StopMsg  ");
		StopMsg Sm = factory.CreateStopMsg();
		Sm.StopMsg();
	}
	
	public void PrintReceipt()
	{
		System.out.println("\n OUTPUT:: Action PrintReceipt  ");
		PrintReceipt Pr = factory.CreatePrintReceipt();
		Pr.PrintReceipt(dataStore);
	}
	public void CancelMsg()
	{
		System.out.println("\n OUTPUT:: Action CancelMsg  ");
		CancelMsg Cm = factory.CreateCancelMsg();
		Cm.CancelMsg();
	}
	
}
