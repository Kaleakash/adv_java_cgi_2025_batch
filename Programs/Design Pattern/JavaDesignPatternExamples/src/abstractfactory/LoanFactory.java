package abstractfactory;

public class LoanFactory {

public static Loan getLoan(String type) {
		
		Loan loan=null;
		switch (type) {
		case "home":loan =new HomeLoan();
			break;
		case "personal":loan =new PersonalLoan();
			break;
		default:loan=null;
			break;
		}
		return loan;
	}
}
