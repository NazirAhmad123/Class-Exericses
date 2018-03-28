package Inheritance;

public class Fish extends Animal{
//   gills, fins, eyes
	private int gills;
	private int fin;
	private int eyes;
	
	
	Fish(String name, int body, int brain, int weight, int size, int gills, int fin, int eyes){
		super(name, body, brain, weight, size);
		this.gills = gills;
		this.fin = fin;
		this.eyes = eyes;
	}
	
//	Methods
//	How does a fish move.
	public void rest(){
		System.out.println("Fish is resting.");
	}
	
	public void moveMuscle(){
		System.out.println("Fish is moving muscles.");
	}
	public void moveBackFin(){
		System.out.println("Fish is moving Backfins.");
	}
	@Override
	public void move(int speed){
		System.out.println("Fish.move() is called.");
		System.out.println("At speed " + speed);
		rest();
		moveMuscle();
		moveBackFin();
		
	}
	
	
}
