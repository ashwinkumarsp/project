package strategy;
import data_store.*;

/* 
 *  CLASS : PrintReceipt1 (STRAGTEGY PATTERN)
 */

public class PrintReceipt1 extends PrintReceipt {
	
	public void PrintReceipt(DataStore dataStore)
	{
		System.out.println("Total : "+ ((DataStore1)dataStore).getTotal());
	}

}