
import gas_pump.GasPump1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mda_efsm.MDAEFSM;
import output.Output;
import gas_pump.GasPump1;
import gas_pump.GasPump2;
import gas_pump.GasPump3;
import abstract_factory.ConcreteFactory1;
import abstract_factory.ConcreteFactory2;
import abstract_factory.ConcreteFactory3;


/*
 * CLASS : Driver ( Main function Program)
 */
public class Driver
{
    public static void main( String[] args) throws IOException
    {
    	
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	String input = null;
    	int choice = 1;
    	
		System.out.println(" ******** CS 586 Projcet Demo *******" );
		System.out.println("          1. GP-1" );
		System.out.println("          2. GP-2" );
		System.out.println("          3. GP-3" );
		 
		input = bufferedReader.readLine();
		if(input.equalsIgnoreCase("1"))
		{
			
	    	ConcreteFactory1 factory = new ConcreteFactory1();
	    	Output output = new Output(factory,factory.GetDataStore());
	    	MDAEFSM mdaefsm = new MDAEFSM(factory,output);
	    	GasPump1 gp1 = new GasPump1(mdaefsm,factory.GetDataStore());
	    	
	    	int a,pay,withdraw,c;
	    	String PIN;
    	
	    	System.out.println("*************************************");
	        System.out.println("          Menu of Operations" );	
	        System.out.println("          0. Activate(int)" );
	        System.out.println("          1. Start()" );
	        System.out.println("          2. PayCredit()" );
	        System.out.println("          3. Reject()" );
	        System.out.println("          4. Cancel()" );
	        System.out.println("          5. Approved()" );
	        System.out.println("          6. PayCash(int)" );
	        System.out.println("          7. StartPump()" );
	        System.out.println("          8. PumpGallon()" );
	        System.out.println("          9. StopPump()" );
	        System.out.println("          q. Quit the demo program" );	
	        System.out.println("  Please make a note of these operations" );	  	    	
	        System.out.println("           GP-1 Execution" );
	          
	        while (true) 
	        {
	        	
	        	System.out.println("  Select Operation: ");
	        	System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-PayCash,7-StartPump,8-PumpGallon,9-StopPump,q-Quit");
	             
				input = bufferedReader.readLine();
	
	            if(input.isEmpty()) continue;
	            if(input.equalsIgnoreCase("q"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	            
	            switch(choice)
	            {
	             case 0:   //Activate
	      			System.out.println("\n  Operation:  Activate(int a)");
	      			System.out.println("   Enter value of the parameter a:");
	      			input = bufferedReader.readLine();
	      			a = Integer.parseInt(input);
	      			
	      			gp1.Activate(a);
	      			
	      			break;
	      			
		      	 case 1:   //Start
		      			System.out.println("\n  Operation:  Start()");
		      			System.out.println("   Select Payment:");
		      			System.out.println("   1.Cash");
		      			System.out.println("   2.Credit");
		      			input = bufferedReader.readLine();
		      			pay = Integer.parseInt(input);
		      			gp1.Start();
		      			break;
	
		      	   case 2:  //PayCredit
		      			System.out.println("  Operation:  PayCredit()");
		      			System.out.println("  Waiting for approval");
		      			gp1.PayCredit();
		      			break;
	
		      	    case 3:  //reject
		      			System.out.println("  Operation:  Reject()");
		      			gp1.Reject();
		      			break;
		      				
		      	  case 4:  //cancel
		      			System.out.println("  Operation:  Cancel()");
		      			gp1.Cancel();
		      			break;
	
		      	    case 5:  // Approved
		      			System.out.println("  Operation:  Approved()");
		      			gp1.Approved();
		      			break;
	
		      	    case 6:  // PayCash
		      			System.out.println("  Operation:  PayCash(int c)");
		      			System.out.println(" Enter the Amount:");
		      			input = bufferedReader.readLine();
		      			c = Integer.parseInt(input);
		      			gp1.PayCash(c);
		      			break;
	
		      	    case 7:  // StartPump
		      			System.out.println("  Operation:  StartPump()");		
		      			gp1.StartPump();
		      			break;
	
		      	    case 8:  // PumpGallon
		      			System.out.println("  Operation:  PumpGallon()");
		      			
		      			gp1.PumpGallon();
		      			break;
		      		
		      	  case 9:  // StopPump
		      			System.out.println("  Operation:  StopPump()");
		      			gp1.StopPump();
		      			break;
		      			
		      		default:
		      			System.out.println("Invalid Choice");
		      			break;
	            }
	        }
	        System.out.println("Thanks for using Gas Pump - 1" );
		}
		else if(input.equalsIgnoreCase("2"))
		{
			ConcreteFactory2 factory = new ConcreteFactory2();
	    	Output output = new Output(factory,factory.GetDataStore());
	    	MDAEFSM mdaefsm = new MDAEFSM(factory,output);
	    	GasPump2 gp2 = new GasPump2(mdaefsm,factory.GetDataStore());
	    	
	    	float a,b,c;
    	
	    	System.out.println("*************************************");
	        System.out.println("          Menu of Operations" );	
	        System.out.println("          0. Activate(float, float)" );
	        System.out.println("          1. Start()" );
	        System.out.println("          2. PayCredit()" );
	        System.out.println("          3. Reject()" );
	        System.out.println("          4. Cancel()" );
	        System.out.println("          5. Approved()" );
	        System.out.println("          6. Super()" );
	        System.out.println("          7. Regular()" );
	        System.out.println("          8. StartPump()" );
	        System.out.println("          9. PumpGallon()" );
	        System.out.println("          10. StopPump()" );
	        System.out.println("          q. Quit the demo program" );	
	        System.out.println("  Please make a note of these operations" );	  	    	
	        System.out.println("           GP-2 Execution" );
	          
	        while (true) 
	        {
	        	
	        	System.out.println("  Select Operation: ");
	        	System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-Super,7-Regular,8-StartPump,9-PumpGallon,10-StopPump,q-Quit");
	             
				input = bufferedReader.readLine();
	            if(input.isEmpty()) continue;
	            if(input.equalsIgnoreCase("q"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	            
	            switch(choice)
	            {
	             case 0:   //Activate
	      			System.out.println("\n  Operation:  Activate(float a, float b)");
	      			
	      			System.out.println("   Enter value of the parameter a:");
	      			input = bufferedReader.readLine();
	      			a = Integer.parseInt(input);
	      			
	      			System.out.println("   Enter value of the parameter b:");
	      			input = bufferedReader.readLine();
	      			b = Integer.parseInt(input);
	      			gp2.Activate(a,b);
	      			
	      			break;
	      			
		      	 case 1:   //Start
		      			System.out.println("\n  Operation:  Start()");
		      			System.out.println("   Select Payment:");
		      			System.out.println("   1.Credit");
		    
		      			gp2.Start();
		      			break;
	
		      	   case 2:  //PayCredit
		      			System.out.println("  Operation:  PayCredit()");
		      			System.out.println("  Waiting for approval");
		      			gp2.PayCredit();
		      			break;
	
		      	    case 3:  //reject
		      			System.out.println("  Operation:  Reject()");
		      			gp2.Reject();
		      			break;
		      				
		      	  case 4:  //cancel
		      			System.out.println("  Operation:  Cancel()");
		      			gp2.Cancel();
		      			break;
	
		      	    case 5:  // Approved
		      			System.out.println("  Operation:  Approved()");
		      			gp2.Approved();
		      			break;
	
		      	  case 6:  // Super
		      			System.out.println("  Operation:  Super()");
		      			gp2.Super();
		      			break;
		      			
		      	  case 7:  // Regular
		      		  	System.out.println("  Operation:  Regular()");
		      		  	gp2.Regular();
		      		  	break;
		     
	
		      	    case 8:  // StartPump
		      			System.out.println("  Operation:  StartPump()");		
		      			gp2.StartPump();
		      			break;
	
		      	    case 9:  // PumpGallon
		      			System.out.println("  Operation:  PumpGallon()");
		      			
		      			gp2.PumpGallon();
		      			break;
		      		
		      	  case 10:  // StopPump
		      			System.out.println("  Operation:  StopPump()");
		      			gp2.StopPump();
		      			break;
		      			
		      		default:
		      			System.out.println("Invalid Choice");
		      			break;
	            }
	        }
	        System.out.println("Thanks for using Gas Pump - 2" );
		}
		else if(input.equalsIgnoreCase("3"))
		{
			ConcreteFactory3 factory = new ConcreteFactory3();
	    	Output output = new Output(factory,factory.GetDataStore());
	    	MDAEFSM mdaefsm = new MDAEFSM(factory,output);
	    	GasPump3 gp3 = new GasPump3(mdaefsm,factory.GetDataStore());
	    	
	    	float a,b,c;
	    	String PIN;
    	
	    	System.out.println("*************************************");
	        System.out.println("          Menu of Operations" );	
	        System.out.println("          0. Activate(float, float)" );
	        System.out.println("          1. Start()" );
	        System.out.println("          2. PayCash(float c)" );
	        System.out.println("          3. Cancel()" );
	        System.out.println("          4. Premium()" );
	        System.out.println("          5. Regular()" );
	        System.out.println("          6. StartPump()" );
	        System.out.println("          7. PumpLiter()" );
	        System.out.println("          8. StopPump()" );
	        System.out.println("          9. Receipt()" );
	        System.out.println("          10. No-Receipt()" );
	        System.out.println("          q. Quit the demo program" );	
	        System.out.println("  Please make a note of these operations" );	  	    	
	        System.out.println("           GP-3 Execution" );
	          
	        while (true) 
	        {
	        	
	        	System.out.println("  Select Operation: ");
	        	System.out.println("0-Activate,1-Start,2-PayCash,3-Cancel,4-Premium,5-Regular,6-StartPump,7-PumpLiter,8-StopPump,9-Receipt,10-No-Receipt,q-Quit");
	             
				input = bufferedReader.readLine();
	            if(input.isEmpty()) continue;
	            if(input.equalsIgnoreCase("q"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	            
	            switch(choice)
	            {
	             case 0:   //Activate
	      			System.out.println("\n  Operation:  Activate(float a, float b)");
	      			
	      			System.out.println("   Enter value of the parameter a:");
	      			input = bufferedReader.readLine();
	      			a = Integer.parseInt(input);
	      			
	      			System.out.println("   Enter value of the parameter b:");
	      			input = bufferedReader.readLine();
	      			b = Integer.parseInt(input);
	      			gp3.Activate(a,b);
	      			
	      			break;
	      			
		      	 case 1:   //Start
		      			System.out.println("\n  Operation:  Start()");
		      			System.out.println("   Select Payment:");
		      			System.out.println("   1.Cash");
		    
		      			gp3.Start();
		      			break;
	
		      	   case 2:  //PayCash
		      			System.out.println("  Operation:  PayCash(float c)");
		      			System.out.println(" Enter the Amount:");
		      			input = bufferedReader.readLine();
		      			c = Integer.parseInt(input);
		      			gp3.PayCash(c);
		      			break;
	
		      				
		      	  case 3:  //cancel
		      			System.out.println("  Operation:  Cancel()");
		      			gp3.Cancel();
		      			break;
	
		      	  case 4:  // Premium
		      			System.out.println("  Operation:  Premium()");
		      			gp3.Premium();
		      			break;
		      			
		      	  case 5:  // Regular
		      		  	System.out.println("  Operation:  Regular()");
		      		  	gp3.Regular();
		      		  	break;
		     
	
		      	    case 6:  // StartPump
		      			System.out.println("  Operation:  StartPump()");		
		      			gp3.StartPump();
		      			break;
	
		      	    case 7:  // PumpLiter
		      			System.out.println("  Operation:  PumpLiter()");
		      			gp3.PumpLiter();
		      			
		      			break;
		      		
		      	  case 8:  // StopPump
		      			System.out.println("  Operation:  StopPump()");
		      			gp3.StopPump();
		      			break;
		      	 case 9:  // Receipt
		      			System.out.println("  Operation:  Receipt()");
		      			gp3.Receipt();
		      			break;
		      	 case 10:  // No-Receipt
		      			System.out.println("  Operation:  NoReceipt()");
		      			gp3.NoReceipt();
		      			break;
		      		default:
		      			System.out.println("Invalid Choice");
		      			break;
	            }
	        }
	        System.out.println("Thanks for using Gas Pump - 3" );
		}
    }
}
	       
