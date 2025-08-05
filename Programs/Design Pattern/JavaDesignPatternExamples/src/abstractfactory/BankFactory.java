package abstractfactory;


public class BankFactory {

	public static void processBankingSubModule(String module,String type, double amount) {
		
		if(module.equals("loan")) {
			Loan loan = LoanFactory.getLoan(type);
			loan.processLoan(amount);
		}
		if(module.equals("payment")) {
			Payment payment = PaymentFactory.getPayment(type);
			
			payment.processPaymeent(amount);
		}
	}
}
