package strategy;
import data_store.*;

/* 
 *  CLASS : StoreCash3 (STRAGTEGY PATTERN)
 */

public class StoreCash3 extends StoreCash {
	
	public void StoreCash(DataStore dataStore)
	{
		((DataStore3)dataStore).setCash(((DataStore3)dataStore).cash);
	}
	
}
