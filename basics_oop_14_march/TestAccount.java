package basics_oop;

public class TestAccount {
	public static void main(String[] args) {
		
		Account acc1 = new Account("B0123456",1000.0,"ahmad",
				"ahmad@email.com","0123456789");
		acc1.deposit(500);
		acc1.withdrawal(250);
		acc1.withdrawal(300);
		
//		acc1.setCustName("Ali");
//		acc1.setCustEmail("ali@email.com");
//		acc1.setCustPhoneNumber("011 23 456");
		System.out.println("Name: "+acc1.getCustName());
		System.out.println("Email: "+acc1.getCustEmail());
		System.out.println("Phone: "+acc1.getCustPhoneNumber());
		
		Account acc2 = new Account("B745646",500.0,"ali",
				"ali@email.com","08986543");
		acc2.deposit(500);
		acc2.withdrawal(250);
//		acc1.setCustName("Ali");
//		acc1.setCustEmail("ali@email.com");
//		acc1.setCustPhoneNumber("011 23 456");
		System.out.println("Name: "+acc2.getCustName());
		System.out.println("Email: "+acc2.getCustEmail());
		System.out.println("Phone: "+acc2.getCustPhoneNumber());
		
		Account acc3 = new Account("amin","amin@email.com","78465839");
		System.out.println(acc3.getCustEmail());
		System.out.println("Default customer email: "+acc3.getAccNumber());
	       
// Create a new class called VipCustomers
// It should have 3 fields, name, credit limit and email address
// Create three constructors
// 1th constructor empty should call the constructor with 3 parameters 
// with default values
// 2th constructor should pass on the two values it receives and add 
// a default value for the third
// 3th constructor should save all the fields
// Create getters to test if they work.
		
		VipCustomers vip1 = new VipCustomers();
		System.out.println("Name: " + vip1.getName());
		
		VipCustomers vip2 = new VipCustomers("John","1000","John@email.com");
		System.out.println("Name: " + vip2.getName());
		
		VipCustomers vip3 = new VipCustomers("5000","vip3@email.com");
		System.out.println("Name: " + vip3.getName());
		System.out.println(vip3.getEmailAddress());
		
	}

}
