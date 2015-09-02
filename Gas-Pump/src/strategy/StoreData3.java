package strategy;
import data_store.*;

/* 
 *  CLASS : StoreData3 (STRAGTEGY PATTERN)
 */

public class StoreData3 extends StoreData {
	
	public void StoreData(DataStore dataStore)
	{
		
	}

	@Override
	public void StoreData(DataStore dataStore, DataStore dataStore1) {
		// TODO Auto-generated method stub
		((DataStore3)dataStore).settemp_a(((DataStore3)dataStore).temp_a);
		((DataStore3)dataStore).settemp_b(((DataStore3)dataStore).temp_b);
	}
}
