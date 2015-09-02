package mda_efsm;

import abstract_factory.AbstractFactory;
import output.Output;

public class MDAEFSM {
	
	State startstate = new StartState(this);
	State s0 = new S0(this);
	State s1 = new S1(this);
	State s2 = new S2(this);
	State s3 = new S3(this);
	State s4 = new S4(this);
	State s5 = new S5(this);
	State s6 = new S6(this);
	
	State efsmState = null;
	
	AbstractFactory factory =null;
	Output output = null;
	
	
	public MDAEFSM (AbstractFactory factory, Output output)
	{
		efsmState = startstate;
        this.factory = factory;
        this.output = output;
	}
	
	public void activate()
	{
		efsmState.Activate();
		printCurrentState();
	}
	
	public void Start ()
	{
		efsmState.Start();
		printCurrentState();
	}
	
	public void PayCredit()
	{
		efsmState.PayCredit();
		printCurrentState();
	}
	
	public void Reject()
	{
		efsmState.Reject();
		printCurrentState();
	}
	
	public void Cancel()
	{
		efsmState.Cancel();
		printCurrentState();
	}
	
	public void Approved()
	{
		efsmState.Approved();
		printCurrentState();
	}
	
	public void PayCash()
	{
		efsmState.PayCash();
		printCurrentState();
	}
	
	public void StartPump()
	{
		efsmState.StartPump();
		printCurrentState();
	}
	
	public void Pump()
	{
		efsmState.Pump();
		printCurrentState();
	}
	
	public void StopPump()
	{
		efsmState.StopPump();
		printCurrentState();
	}
	
	public void SelectGas(int i)
	{
		efsmState.SelectGas(i);
		printCurrentState();
	}
	
	public void Receipt()
	{
		efsmState.Receipt();
		printCurrentState();
	}
	
	public void NoReceipt()
	{
		efsmState.NoReceipt();
		printCurrentState();
	}
	
    public void setState(State efsmState) 
    {
        this.efsmState = efsmState;
    }
    public State getGasPumpState() 
    {
        return efsmState;
    }
    
    public State getS0State() 
    {
        return s0;
    }
    public State getS1State() 
    {
        return s1;
    }
    public State getS2State() 
    {
        return s2;
    }
    
    public State getS3State() 
    {
        return s3;
    }
    
    public State getS4State() 
    {
        return s4;
    }
    
    public State getS5State() 
    {
        return s5;
    }
    
    public State getS6State() 
    {
        return s6;
    }
	public void printCurrentState()
	{
		System.out.println("----- Current State :"+ efsmState.getClass().getName());
	}
}
