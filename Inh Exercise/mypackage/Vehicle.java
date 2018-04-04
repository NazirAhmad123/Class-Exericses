package mypackage;

public class Vehicle {
	private String name;
	private String size;
	
	private int currentVelcity;
	private int currentDirection;
	
	
	Vehicle(String name, String size){
		this.name = name;
		this.size = size;
		this.currentVelcity = 0;
		this.currentDirection =0;
	}
	
//	Method for steering
	public void steer(int direction){
		this.currentDirection = direction;
		System.out.println("Chaning direction at " + this.currentDirection + " degrees.");
	}
	
//	Method for move. You'lll need velocity and direction.
	public void move(int velocity, int direction){
		this.currentVelcity = velocity;
		this.currentDirection = direction;
		System.out.println("Moving at speed " + currentVelcity +
				" at " + currentDirection + " degrees.");
		
	}
	public void stop(){
		this.currentVelcity = 0;
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelcity() {
		return currentVelcity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}
	
	
	

}
