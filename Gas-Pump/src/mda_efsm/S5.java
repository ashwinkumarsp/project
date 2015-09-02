package mda_efsm;

public class S5 implements State {

	MDAEFSM mdaefsm = null;

	public S5(MDAEFSM mdaefsm)
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
		mdaefsm.output.PumpGasUnit();
		mdaefsm.output.GasPumpedMsg();
		mdaefsm.output.PumpGasUnit();
		mdaefsm.setState(mdaefsm.getS5State());
		
	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub
		mdaefsm.output.StopMsg();	
		mdaefsm.setState(mdaefsm.getS6State());
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
