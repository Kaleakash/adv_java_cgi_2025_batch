package encapsulation;

public class Employee {
private int id;
private String name;
private float salary;
//void setValue(int id1, String name1, float salary1) {
//	id = id1;
//	name=name1;
//	//salary=salary1;
//	if(salary1<0) {
//		salary = 8000;
//	}else {
//		salary=salary1;
//	}
//}
void setValue(int id, String name, float salary) {
	this.id = id;
	this.name=name;
	//salary=salary1;
	if(salary<0) {
		this.salary = 8000;
	}else {
		this.salary=salary;
	}
}
void display() {
	System.out.println("id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
}
}
