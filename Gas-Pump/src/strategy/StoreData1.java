package strategy;
import data_store.*;

/* 
 *  CLASS : StoreData1 (STRAGTEGY PATTERN)
 */

public class StoreData1 extends StoreData {
	
	public void StoreData(DataStore dataStore)
	{
		((DataStore1)dataStore).settemp_a(((DataStore1)dataStore).temp_a);
	}

	@Override
	public void StoreData(DataStore dataStore, DataStore dataStore1) {
		// TODO Auto-generated method stub
		
	}
	
}
