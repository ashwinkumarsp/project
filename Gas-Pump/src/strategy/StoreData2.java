package strategy;
import data_store.*;

/* 
 *  CLASS : StoreData2 (STRAGTEGY PATTERN)
 */

public class StoreData2 extends StoreData {
	
	public void StoreData(DataStore dataStore)
	{
		
	}

	@Override
	public void StoreData(DataStore dataStore, DataStore dataStore1) {
		// TODO Auto-generated method stub
		((DataStore2)dataStore).settemp_a(((DataStore2)dataStore).temp_a);
		((DataStore2)dataStore).settemp_b(((DataStore2)dataStore).temp_b);
	}
}
