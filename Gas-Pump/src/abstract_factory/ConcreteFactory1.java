package abstract_factory;

import strategy.*;
import data_store.DataStore;
import data_store.DataStore1;

public class ConcreteFactory1 implements AbstractFactory{
	DataStore datastore = new DataStore1();
	StoreData storedata = new StoreData1();
	PayMsg paymsg = new PayMsg1();
	StoreCash storecash = new StoreCash1();
	DisplayMenu displaymenu = new DisplayMenu1();
	RejectMsg rejectmsg = new RejectMsg1();
	SetW settingw1 = new SetW1();
	SetPrice setprice = new SetPrice1();
	ReadyMsg readymsg = new ReadyMsg1();
	SetInitialValues setinitialvalues = new SetInitialValues1();
	PumpGasUnit pumpgasunit = new PumpGasUnit1();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg1();
	StopMsg stopmsg = new StopMsg1();
	PrintReceipt printreceipt = new PrintReceipt1();
	CancelMsg cancelmsg = new CancelMsg1();
	
	
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
	public StoreCash CreateStoreCash(){
		return this.storecash;
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
		return this.settingw1;
	}

	@Override
	public SetPrice CreateSetPrice(int g) {
		// TODO Auto-generated method stub
		return this.setprice;
	}

	@Override
	public ReadyMsg CreateReadyMsg() {
		// TODO Auto-generated method stub
		return this.readymsg;
	}

	@Override
	public SetInitialValues CreateSetIntialValues() {
		// TODO Auto-generated method stub
		return this.setinitialvalues;
	}

	@Override
	public GasPumpedMsg CreateGasPumpedmsg() {
		// TODO Auto-generated method stub
		return gaspumpedmsg;
	}
	
}
