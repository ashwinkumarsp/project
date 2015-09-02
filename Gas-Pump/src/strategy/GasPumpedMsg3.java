package strategy;
import data_store.*;

/* 
 *  CLASS : GasPumpedMsg3 (STRAGTEGY PATTERN)
 */

public class GasPumpedMsg3 extends GasPumpedMsg {
	
	public void GasPumpedMsg(DataStore dataStore)
	{
		System.out.println("Gallons Pumped = "+ ((DataStore3)dataStore).getL());
	
	}
	
}

