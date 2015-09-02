package abstract_factory;
import data_store.*;
import strategy.*;

public interface AbstractFactory 
{
	public DataStore CreateDataStore();
	public StoreData CreateStoreData();
	public PayMsg CreatePayMsg();
	public StoreCash CreateStoreCash();
	public DisplayMenu CreateDisplayMenu();
	public RejectMsg CreateRejectMsg();
	public SetW CreateSetW(int k);
	public SetPrice CreateSetPrice(int g);
	public ReadyMsg CreateReadyMsg();
	public SetInitialValues CreateSetIntialValues();
	public PumpGasUnit CreatePumpGasUnit();
	public GasPumpedMsg CreateGasPumpedmsg();
	public StopMsg CreateStopMsg();
	public PrintReceipt CreatePrintReceipt();
	public CancelMsg CreateCancelMsg();
	
	
}
