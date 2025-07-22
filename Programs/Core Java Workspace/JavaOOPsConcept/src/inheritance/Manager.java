package inheritance;

public class Manager extends Employee{
private int numberOfEmp;

		public void readMgr() {
		readEmp();
		System.out.println("Enter the number of Employee working under him/her");
		numberOfEmp = sc.nextInt();
		add.readAdd();
		}
	
		public void disMgr() {
			disEmp();
			System.out.println("Number of employee working "+numberOfEmp);
			add.disAdd();
		}
}
