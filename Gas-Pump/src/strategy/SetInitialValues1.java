package strategy;
import data_store.*;

/* 
 *  CLASS : SetInitialValues1 (STRAGTEGY PATTERN)
 */

public class SetInitialValues1 extends SetInitialValues {

	public void SetInitialValues(DataStore dataStore)
	{
		 ((DataStore1)dataStore).G = 0;
	}
	
}
