package interface_;

interface Telephone {
	
	void powerOn();
	void dialNumber(int phoneNumber);
	void callNumber(int phoneNumber);
	void answer();
	boolean isRinging();
}
class DeskPhone implements Telephone {
	private int myNumber;
	private boolean isRinging = true;
	
	DeskPhone(int myNumber){
		this.myNumber = myNumber;
	}
	public void powerOn(){
		System.out.println("No action taken.\n"
				+ "A Deskphone doesn't have a power button.");
	}
	public void dialNumber(int phoneNumber){
		if(phoneNumber == myNumber){
			System.out.println("Dialing " + myNumber);
		}
	}
	public void callNumber(int phoneNumber){
		if(phoneNumber == myNumber){
			System.out.println("Calling " + myNumber);
		}
	}
	public void answer(){
		if(isRinging){
			System.out.println("answering...");
			isRinging = false;
		}else {
			System.out.println("Not ringing.");
		}
	}
	public boolean isRinging(){
		return isRinging;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Telephone myPhone = new DeskPhone(12345);
		myPhone.powerOn();
		myPhone.dialNumber(12345);
		myPhone.callNumber(12345);
		myPhone.answer();
		
	}

}
