package encapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		// 1st option 
		Customer c1 = new Customer();
		c1.setCid(100);
		c1.setCname("Ravi");
		
		
		System.out.println(c1.getCid()+" "+c1.getCname());
		
		//2nd option 
		Customer c2 = new Customer(101, "Ajay");
		System.out.println(c2.getCid()+" "+c2.getCname());
	}

}
