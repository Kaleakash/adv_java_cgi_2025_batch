package proxy;

public class MainDemo {

	public static void main(String[] args) throws Exception{
		Internet internet = new ProxyInternet();
		
		//internet.connectTo("google.com");
		internet.connectTo("facebook.com");
	}

}
