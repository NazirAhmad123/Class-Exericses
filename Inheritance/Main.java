package Inheritance;

public class Main {
	public static void main(String[] args) {
		
		//System.out.println("Hello world");
		// base class -> General class
		// subclasses inherate from the base class
		Animal animal = new Animal("Animal",1,1,20,30);
		//animal.eat();
		
		Dog dog = new Dog("dog", 1, 1, 23, 15,2,1,22);
		//dog.chew();
		//dog.eat();
		dog.move(10);;
		
	}

}
