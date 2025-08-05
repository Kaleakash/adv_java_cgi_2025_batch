package decorator;

public class BasicCoffee implements Coffee{

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 50;
	}@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Coffee with price as "+cost();
	}
}
