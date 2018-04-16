package polym;

public class Animal {

	private String name = "Animal";
	public String favFood = "Food";


	protected final void changeName(String newName){
		this.name = newName;
	}

	protected final String getName(){
		return this.name;
	}


	public void eat(){
		System.out.println("Eating " + favFood);
	}

	public void walk() {
		System.out.println(this.name + " is walking.");
	}

	Animal(){}
	Animal(String name, String favFood){
		this.name = name;
		this.favFood = favFood;
	}

}
class Cats extends Animal{

	public String favToy;

	public void playWith(){
		System.out.println("Playing with " + favToy);
	}

	public void walk(){
		System.out.println(this.getName() + " stalks around and then sleeps.");
	}

	public String getFavToy(){
		return this.favToy;
	}
	Cats(){}
	Cats(String name, String favFood, String favToy){
		super(name, favFood);
		this.favToy = favToy;
	}
}
class Main {
	public static void main(String args[]) {

		Animal genericAnimal = new Animal();
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);


		Cats cats = new Cats("myCat", "gg", "ff");
		System.out.println(cats.getName());
		System.out.println(cats.favToy);
		System.out.println(cats.favFood);

		Animal tabby = new Cats("Tabby", "Salmon", "Ball");
		acceptAnimal(tabby);
	}
	public static void acceptAnimal(Animal randAnimal){

		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);

		randAnimal.walk();
		System.out.println(((Cats)randAnimal).favToy);

		if (randAnimal instanceof Cats){
			System.out.println(((Cats) randAnimal).getName() + " is a cat.");
		}
		if (randAnimal instanceof Animal) {
			System.out.println(randAnimal.getName() + " is an animal.");
		}
	}

}
