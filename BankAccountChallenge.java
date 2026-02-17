class BankAccount{
	private double balance = 0;
	
	public double deposit(double amount){
		if(amount > 0){
			balance += amount;
			System.out.println("Deposited: $ " + amount);
		}else{
			System.out.println("Invalid Deposite Amount!");
		}
	}
	
	public double getBalance(){
		return balance;
	}
}

public class BankAccountChallenge{
	public static void main(String[]args){
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(150.90);
		System.out.println("Current Balance: $ " + myAccount.getBalance());
	}
}