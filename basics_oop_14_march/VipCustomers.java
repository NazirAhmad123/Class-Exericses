package basics_oop;

public class VipCustomers {
	private String name;
	private String creditLimit;
	private String emailAddress;
	
	
	VipCustomers(){
		this("def name","def credLimit","defaultemail");
	}
	VipCustomers(String name, String creditLimit, String emailAddress){
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	VipCustomers(String creditLimit, String emailAddress){
		this("Safi",creditLimit, emailAddress);
	}
	public String getName() {
		return name;
	}
	public String getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	
	

}
