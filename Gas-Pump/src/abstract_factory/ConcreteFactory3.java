package abstract_factory;


import strategy.*;
import data_store.DataStore;
import data_store.DataStore3;

public class ConcreteFactory3 implements AbstractFactory{

	
	DataStore datastore = new DataStore3();
	StoreData storedata = new StoreData3();
	PayMsg paymsg = new PayMsg3();
	StoreCash storecash = new StoreCash3();
	DisplayMenu displaymenu = new DisplayMenu3();
	RejectMsg rejectmsg = new RejectMsg3();
	ReadyMsg readymsg = new ReadyMsg3();
	SetInitialValues setinitialvalues = new SetInitialValues3();
	PumpGasUnit pumpgasunit = new PumpGasUnit3();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg3();
	StopMsg stopmsg = new StopMsg3();
	PrintReceipt printreceipt = new PrintReceipt3();
	CancelMsg cancelmsg = new CancelMsg3();
	
	
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
		return null;
	}

	@Override
	public SetPrice CreateSetPrice(int g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadyMsg CreateReadyMsg() {
		// TODO Auto-generated method stub
		return null;
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
	
	
}
