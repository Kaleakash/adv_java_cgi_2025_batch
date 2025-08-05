package adapter;

public class AdapterNewCode implements NewTechnology{

	private LegacyCode legacyCode;
	
	public AdapterNewCode() {
		// TODO Auto-generated constructor stub
	}
	AdapterNewCode(LegacyCode legacyCode){
		this.legacyCode=legacyCode;
	}
	public void callNewCode() {
		System.out.println("new code");
		legacyCode.display();
	}
}


