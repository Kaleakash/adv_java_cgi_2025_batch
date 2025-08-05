package abstractfactory;
public class PersonalLoan implements Loan{
	@Override
	public void processLoan(double amount) {
		System.out.println("Personal loand proccessed "+amount);
		
	}
	}
