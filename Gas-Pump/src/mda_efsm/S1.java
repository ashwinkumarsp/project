package mda_efsm;

public class S1 implements State{

	MDAEFSM mdaefsm = null;

	public S1(MDAEFSM mdaefsm)
	{
		this.mdaefsm=mdaefsm;
	}
	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PayCredit() {
		// TODO Auto-generated method stub
		mdaefsm.setState(mdaefsm.getS2State());
		
	}

	@Override
	public void PayCash() {
		// TODO Auto-generated method stub
		mdaefsm.output.StoreCash();
		mdaefsm.output.SetW(0);
		mdaefsm.output.DisplayMenu();	
		mdaefsm.setState(mdaefsm.getS3State());
		
	}

	@Override
	public void Reject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StartPump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SelectGas(int g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub
		
	}

}
