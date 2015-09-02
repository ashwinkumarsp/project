package strategy;
import data_store.*;

/* 
 *  CLASS : SetPrice2 (STRAGTEGY PATTERN)
 */

public class SetPrice2 extends SetPrice {
	
	public void SetPrice(int i)
	{
		DataStore dataStore = null;
		if(i==0)
		{
			((DataStore2)dataStore).setPrice(((DataStore2)dataStore).gettemp_a());
		}
		
		else if (i==1)
		{
			((DataStore2)dataStore).setPrice(((DataStore2)dataStore).gettemp_b());
			
		}
		
	}

}