package utility;

import java.util.Comparator;

import bean.Employee;

public class SalarySortAsc implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getSalary()-o2.getSalary());
	}
}
