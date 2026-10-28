package oop.encapsulation;

public class Account {

	public double balance = 0;

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Balance after depostite = " + balance);
	}
	
	public void withdraw(double amount) {
		if(balance< amount) {
			System.out.println("Insuffucient funds");
		}else {
			balance = balance - amount;
			System.out.println("Balance after Withdrawal = " + balance);
		}
	}

}
