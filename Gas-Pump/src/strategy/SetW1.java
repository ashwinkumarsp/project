package strategy;
import data_store.*;

/* 
 *  CLASS : SetW1 (STRAGTEGY PATTERN)
 */

public class SetW1 extends SetW {
	
	public void SetW(DataStore dataStore)
	{
		((DataStore1)dataStore).settemp_w(((DataStore1)dataStore).temp_w);
	}

}