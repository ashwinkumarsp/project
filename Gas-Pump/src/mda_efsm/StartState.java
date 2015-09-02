package mda_efsm;

public class StartState implements State{

	MDAEFSM mdaefsm = null;
	
	public StartState(MDAEFSM mdaefsm) {
		// TODO Auto-generated method stub
		this.mdaefsm= mdaefsm;
		
	}
	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		mdaefsm.output.StoreData();
		mdaefsm.setState(mdaefsm.getS0State());
		
	}

	@Override
	public void PayCredit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PayCash() {
		// TODO Auto-generated method stub
		
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


	@Override
	public void Start() {
		// TODO Auto-generated method stub
		
	}

}
