package builder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User.Builder("raj", "raj@gmail.com").build();
		User user2 = new User.Builder("raju", "raju@gmail.com").age(21).build();
		User user3 = new User.Builder("ravi", "ravi@gmail.com").city("Bangalore").age(34).build();
		User user4 = new User.Builder("ravi", "ravi@gmail.com").phonenumber(45677888).build();
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
	}

}
