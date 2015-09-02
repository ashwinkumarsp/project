package strategy;
import data_store.*;

/* 
 *  CLASS : PrintReceipt3 (STRAGTEGY PATTERN)
 */

public class PrintReceipt3 extends PrintReceipt {
	
	public void PrintReceipt(DataStore dataStore)
	{
		System.out.println("Total : "+ ((DataStore3)dataStore).gettotal());
	}

}