package abstract_factory;

import strategy.*;
import data_store.DataStore;
import data_store.DataStore2;

public class ConcreteFactory2 implements AbstractFactory{
	
	DataStore datastore = new DataStore2();
	StoreData storedata = new StoreData2();
	PayMsg paymsg = new PayMsg2();
	DisplayMenu displaymenu = new DisplayMenu2();
	RejectMsg rejectmsg = new RejectMsg2();
	ReadyMsg readymsg = new ReadyMsg2();
	SetPrice setprice = new SetPrice2();
	SetInitialValues setinitialvalues = new SetInitialValues2();
	PumpGasUnit pumpgasunit = new PumpGasUnit2();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg2();
	StopMsg stopmsg = new StopMsg2();
	PrintReceipt printreceipt = new PrintReceipt2();
	CancelMsg cancelmsg = new CancelMsg2();
	
	
	
public void ConcreteFactory(){
		
	}
	
	public DataStore CreateDataStore(){
		return this.datastore;
	}
	public DataStore GetDataStore(){
		return this.datastore;
	}
	public StoreData CreateStoreData(){
		return this.storedata;
	}
	public PayMsg CreatePayMsg(){
		return this.paymsg;
	}
	public DisplayMenu CreateDisplayMenu(){
		return this.displaymenu;
	}
	public RejectMsg CreateRejectMsg(){
		return this.rejectmsg;
	}
	public SetInitialValues CreateSetInitialValues(){
		return this.setinitialvalues;
	}
	public PumpGasUnit CreatePumpGasUnit(){
		return this.pumpgasunit;
	}
	public GasPumpedMsg CreateGasPumpedMsg(){
		return this.gaspumpedmsg;
	}
	public StopMsg CreateStopMsg(){
		return this.stopmsg;
	}
	public PrintReceipt CreatePrintReceipt(){
		return this.printreceipt;
	}
	public CancelMsg CreateCancelMsg(){
		return this.cancelmsg;
	}

	@Override
	public SetW CreateSetW(int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetPrice CreateSetPrice(int g) {
		// TODO Auto-generated method stub
		return setprice;
	}

	@Override
	public ReadyMsg CreateReadyMsg() {
		// TODO Auto-generated method stub
		return readymsg;
	}

	@Override
	public SetInitialValues CreateSetIntialValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GasPumpedMsg CreateGasPumpedmsg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoreCash CreateStoreCash() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
