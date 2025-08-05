package adapter;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewTechnology nt = new AdapterNewCode(new LegacyCode());
		nt.callNewCode();
	}

}
