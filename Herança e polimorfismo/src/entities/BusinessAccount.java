package entities;

public class BusinessAccount extends Account {

	private Double loanLimet;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimet) {
		super(number, holder, balance);
		this.loanLimet = loanLimet;
	}

	public Double getLoanLimet() {
		return loanLimet;
	}

	public void setLoanLimet(Double loanLimet) {
		this.loanLimet = loanLimet;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimet) {
		balance += amount - 10.0;
		
	    }
	   }

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	
   
}
