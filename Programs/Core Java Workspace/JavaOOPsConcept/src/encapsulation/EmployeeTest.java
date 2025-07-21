package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		id = 100;
//		display();
		Employee emp1 = new Employee();
//		emp1.salary=-45000;
//		emp1.id=100;
//		emp1.name="Ravi";
		emp1.setValue(100, "Ravi", 45000);
		emp1.display();
	}

}
