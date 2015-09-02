package strategy;
import data_store.*;

/* 
 *  CLASS : StoreCash1 (STRAGTEGY PATTERN)
 */

public class StoreCash1 extends StoreCash {
	
	public void StoreCash(DataStore dataStore)
	{
		((DataStore1)dataStore).setcash(((DataStore1)dataStore).cash);
	}

	
	
}
