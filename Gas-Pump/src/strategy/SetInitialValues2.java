package strategy;
import data_store.*;

/* 
 *  CLASS : SetInitialValues2 (STRAGTEGY PATTERN)
 */

public class SetInitialValues2 extends SetInitialValues {

	public void SetInitialValues(DataStore dataStore)
	{
		 ((DataStore2)dataStore).G = 0;
	}
	
}
