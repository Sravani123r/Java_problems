package Encapsulation;

public class BankAccount {
	private String name;
	private int accNum;
	private int balance;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		if (balance >= 0) {
			return balance;
		} else {
			System.out.println("Balance is Not valid");
			return 0;
		}
	}
}

class BankMain {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();

		acc1.setName("Sravani");
		acc1.setAccNum(123456);
		acc1.setBalance(8000);

		acc2.setName("Sravan");
		acc2.setAccNum(126457);
		acc2.setBalance(-8000);
		
		System.out.println("Name: " + acc1.getName());
		System.out.println("Account Number: " + acc1.getAccNum());
		System.out.println("Balance: " + acc1.getBalance());
		
		System.out.println("Name: " + acc2.getName());
		System.out.println("Account Number: " + acc2.getAccNum());
		System.out.println("Balance: " + acc2.getBalance());
	}
}
