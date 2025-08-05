package abstractfactory;

public class HomeLoan implements Loan{
@Override
public void processLoan(double amount) {
	System.out.println("Home loand proccessed "+amount);
	
}
}
