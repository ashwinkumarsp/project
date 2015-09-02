package strategy;
import data_store.*;

/* 
 *  CLASS : GasPumpedMsg2 (STRAGTEGY PATTERN)
 */

public class GasPumpedMsg2 extends GasPumpedMsg {
	
	public void GasPumpedMsg(DataStore dataStore)
	{
		System.out.println("Gallons Pumped = "+ ((DataStore2)dataStore).getG());
	}
	
}

