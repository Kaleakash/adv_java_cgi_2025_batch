package proxy;

public class RealInternet implements Internet{

	@Override
	public void connectTo(String url) throws Exception {
	System.out.println("You connect to this web site "+url);
		
	}
}
