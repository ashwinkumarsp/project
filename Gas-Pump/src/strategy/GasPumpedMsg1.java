package strategy;
import data_store.*;

/* 
 *  CLASS : GasPumpedMsg1 (STRAGTEGY PATTERN)
 */

public class GasPumpedMsg1 extends GasPumpedMsg {
	
	public void GasPumpedMsg(DataStore dataStore)
	{
		System.out.println("Gallons Pumped = "+ ((DataStore1)dataStore).getG());
	}
	
}

