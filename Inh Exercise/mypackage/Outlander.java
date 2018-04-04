package mypackage;

public class Outlander extends Car {
	
	private int roadServicesMonthly;

	public Outlander(int roadServicesMonthly) {
		super("Outlnader", "4WD", 5, 5,false,6 );
		this.roadServicesMonthly = roadServicesMonthly;
		// TODO Auto-generated constructor stub
	}
	public void accelerate(int rate){
		int newVelocity = getCurrentVelcity() + rate;	
		
		if (newVelocity == 0){
			stop();
			changeGear(0);
		}
		else if(newVelocity >= 0 && newVelocity <= 10){
			changeGear(1);
		}
		else if (newVelocity >= 10 && newVelocity <= 20){
			changeGear(2);
		}
		else if (newVelocity >= 20 && newVelocity <= 30){
			changeGear(3);
		}
		else if (newVelocity >= 30 && newVelocity <= 40){
			changeGear(4);
		}
		else if (newVelocity >= 40 && newVelocity <= 50){
			changeGear(5);
		}else {
			changeGear(6);
		}
		
		if(newVelocity > 0){
		changeVelocity(newVelocity, getCurrentDirection());
		}
	}
	
	

}
