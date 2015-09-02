package strategy;
import data_store.*;

/* 
 *  CLASS : SetInitialValues3 (STRAGTEGY PATTERN)
 */

public class SetInitialValues3 extends SetInitialValues {

	public void SetInitialValues(DataStore dataStore)
	{
		 ((DataStore3)dataStore).L = 0;
	}
	
}
