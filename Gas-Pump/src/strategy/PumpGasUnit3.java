package strategy;
import data_store.*;

/* 
 *  CLASS : PumpGasUnit3 (STRAGTEGY PATTERN)
 */

public class PumpGasUnit3 extends PumpGasUnit {

	public void PumpGasUnit(DataStore dataStore)
	{
		((DataStore3)dataStore).setL();
		((DataStore3)dataStore).settotal();
	}
	
}
