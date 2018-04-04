package mypackage;

public class Car extends Vehicle{
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	Car(String name, String size,int wheels, int doors, boolean isMuanual, int gears){
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.isManual = isManual;
		this.currentGear = 0;
		this.gears = gears;
		
	}
//	Method for changing gear
	public void changeGear(int gear){
		this.currentGear = gear;
		System.out.println("Car's gear is changed to " +gear);
	} 
	
	public void changeVelocity(int speed, int direction){
		
		System.out.println("changing velocity to " + speed +
				" at " + direction + " degrees.");
		move(speed, direction);
	}

}
