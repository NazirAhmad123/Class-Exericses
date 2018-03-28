package Inheritance;

public class Dog extends Animal {
	
//	States spfic to dog class
	private int eyes;
	private int tail;
	private int teeth;
	
	
	Dog(String name, int body, int brain, int weight, int size, int eyes, int tail, int teeth){
		super(name, body, brain,weight, size);
		this.eyes = eyes;
		this.tail = tail;
		this.teeth = teeth;
	}
	
//	Specific methods for dog class
	public void chew(){
		System.out.println("Dog.chew() is called.");
	}
	
	@Override
	public void eat(){
		System.out.println("Dog.eat() is called.");
		//chew();
		super.eat();
		
	}
	
	
//	How does a dog move
	public void walk(){
		System.out.println("Dog.walk() is called.");
	}
	public void run(){
		System.out.println("Dog.run() is called.");
	}
	
	@Override
	public void move(int speed){
		System.out.println("Dog.move() is called.");
		System.out.println("Dog is moving at "+ speed + " speed.");
		walk();
		run();
		super.move(speed);
	}
	

}
