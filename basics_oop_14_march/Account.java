package basics_oop;

public class Account {
	
	private String accNumber;
	private double balance;
	private String custName;
	private String custEmail;
	private String custPhoneNumber;
	
	public Account(){
		this("Default acc_number",100,"Default name","Default email","Default phone number");
		//System.out.println("The default constructor was called.");
	}
	public Account(String accNumber, double balance, String custName,
			String custEmail, String custPhoneNumber){
		System.out.println("The constructor with parameter was called.");
		this.accNumber = accNumber;
		this.balance = balance;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPhoneNumber = custPhoneNumber;
	}
	public Account(String custName,
			String custEmail, String custPhoneNumber){
		this("BH12345",7000.0,custName, custEmail, custPhoneNumber);
		
	}
	public void deposit(double depositAmount){
		this.balance += depositAmount;
		System.out.println("A deposit of " + depositAmount + " was added.");
		System.out.println("New amount: " + this.balance);
	}
	public void withdrawal(double withdrawalAmount){
		if(this.balance - withdrawalAmount <= 0){
			System.out.println("Only " +this.balance + " is available");
			System.out.println("Withdrawal can't be done.");
		}else {
			this.balance -= withdrawalAmount;
			System.out.println("A withdrawal of " + withdrawalAmount + " was made");
			System.out.println("New amount: " + this.balance);
			
		
		}
	}
	public String getAccNumber() {
		return accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public String getCustName() {
		return custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}

}
