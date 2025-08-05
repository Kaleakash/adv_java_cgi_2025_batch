package decorator;

public class DecoratorTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee cc1 = new BasicCoffee();
		System.out.println(cc1.description());
		Coffee cc2 = new ColdCoffee(new BasicCoffee());
		System.out.println(cc2.description());
		
	}

}
