package Inheritance;

public class Animal {
	
//	Some of the general states
	private String name;
	private int body;
	private int brain;
	private int weight;
	private int size;
	
	Animal(String name, int body, int brain, int weight, int size){
		this.name = name;
		this.body = body;
		this.brain = brain;
		this.weight = weight;
		this.size = size;
	}
	
//	Some general methods
	public void eat(){
//		Every animal eats in some way
		System.out.println("Animal.eat() is called.");
		
		
	}
	
	public void move(int speed){
//		Every animal moves in some way
		System.out.println("Animnal.move() is called.");
	}

	public String getName() {
		return name;
	}

	public int getBody() {
		return body;
	}

	public int getBrain() {
		return brain;
	}

	public int getWeight() {
		return weight;
	}

	public int getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

}
