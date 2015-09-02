package strategy;
import data_store.*;

/* 
 *  CLASS : SetPrice3 (STRAGTEGY PATTERN)
 */

public class SetPrice3 extends SetPrice {
	
	
		public void SetPrice(int i)
		{
			DataStore dataStore = null;
			if(i==0)
			{
				((DataStore3)dataStore).setPrice(((DataStore3)dataStore).gettemp_a());
			}
			
			else if (i==1)
			{
				((DataStore3)dataStore).setPrice(((DataStore3)dataStore).gettemp_b());
				
			}
			
		}
		
	}