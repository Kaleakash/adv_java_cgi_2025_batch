package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

	Internet internet = new RealInternet();
	static List<String> bannedSites;
	
	// this block execute only one when class loaded..
	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("youtube.com");
		bannedSites.add("gmail.com");
		bannedSites.add("facebook.com");
	}
	// it will execute before constructor 
	{
		
	}
	
	public void connectTo(String url) throws Exception{
		if(bannedSites.contains(url.toLowerCase())) {
			throw new Exception("These sites are bannced for you "+url);
		}
		internet.connectTo(url);		// calling RealInternal connectTo method 
	}
}
