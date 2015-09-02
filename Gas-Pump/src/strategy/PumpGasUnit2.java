package strategy;
import data_store.*;

/* 
 *  CLASS : PumpGasUnit2 (STRAGTEGY PATTERN)
 */

public class PumpGasUnit2 extends PumpGasUnit {

	public void PumpGasUnit(DataStore dataStore)
	{
		((DataStore2)dataStore).setG();
		((DataStore2)dataStore).settotal();
	}
	
}
