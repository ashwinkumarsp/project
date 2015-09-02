package strategy;
import data_store.*;

/* 
 *  CLASS : PumpGasUnit1 (STRAGTEGY PATTERN)
 */

public class PumpGasUnit1 extends PumpGasUnit {

	public void PumpGasUnit(DataStore dataStore)
	{
		((DataStore1)dataStore).setG();
		((DataStore1)dataStore).setTotal();
	}
	
}
