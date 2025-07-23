package abstraction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server ss = new Server();
		System.out.println(ss.add(100, 200));
		System.out.println(ss.sub(200, 100));
		ss.ownMethod();
		
		Team1 team1 = new Server();
		System.out.println(team1.add(100, 200));
		//System.out.println(team1.sub(200, 100));
		
		Team2 team2 = new Server();
		//System.out.println(team2.add(100, 200));
		System.out.println(team2.sub(200, 100));
	}

}
