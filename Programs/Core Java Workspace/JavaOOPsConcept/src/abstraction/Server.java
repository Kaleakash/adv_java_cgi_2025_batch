package abstraction;

public class Server implements Team1,Team2{
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}
	public void ownMethod() {
		System.out.println("Server logic");
	}
}
