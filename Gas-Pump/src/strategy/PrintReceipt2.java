package strategy;
import data_store.*;

/* 
 *  CLASS : PrintReceipt2 (STRAGTEGY PATTERN)
 */

public class PrintReceipt2 extends PrintReceipt {
	
	public void PrintReceipt(DataStore dataStore)
	{
		System.out.println("Total : "+ ((DataStore2)dataStore).gettotal());
	}

}