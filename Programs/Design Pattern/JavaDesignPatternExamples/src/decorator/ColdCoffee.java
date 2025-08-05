package decorator;

public class ColdCoffee implements Coffee{

	private BasicCoffee basicCoffee;
	public ColdCoffee(BasicCoffee basicCoffee) {
		// TODO Auto-generated constructor stub
		this.basicCoffee=basicCoffee;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Cold , "+basicCoffee.description()+", "+(cost()+basicCoffee.cost());
	}
}
