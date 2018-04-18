package compchallange.Books;

class ProgrammingBooks {
	private String name;

	ProgrammingBooks(String name) {
		this.name = name;
	}

	public String description(){
		return "No description here.";
	}

	public String getName() {
		return name;
	}
}
// Create 5 sub classes
// 1. Effective java
class EffectiveJava extends ProgrammingBooks {
	// We don't need any parameter for the constructor, because we already know the name of the book in advance.
	EffectiveJava(){
		super("EffectiveJava");
	}

	@Override
	public String description() {
		return "This highly anticipated new edition of the book.";
	}

}

// 2. Introduction to Algorithms
class IntroToAlgorithms extends ProgrammingBooks {
	// We don't need any parameter for the constructor, because we already know the name of the book in advance.
	IntroToAlgorithms(){
		super("Introduction to Algorithms");
	}

	public String description(){
		return "Introduction to Algorithms is a book by Thomas H. Cormen.";
	}
}
// 3. The Art of Computer Programming
class TheAreOfComputerProgramming extends ProgrammingBooks {
	// We don't need any parameter for the constructor, because we already know the name of the book in advance.
	TheAreOfComputerProgramming(){
		super("The Art of Computer Programming");
	}

	@Override
	public String description() {
		return "The Art of Computer Programming is a comprehensive monograph written by Donald Knuth.";
	}
}
// 4. Clean Code
class CleanCode extends ProgrammingBooks {
	// We don't need any parameter for the constructor, because we already know the name of the book in advance.
	CleanCode(){
		super("Clean Code");
	}

	@Override
	public String description() {
		return "Even bad code can function. But if code isn't clean, it can bring a development organization to its knees.";
	}
}

// 5. Code Complete
class CodeComplete extends ProgrammingBooks {
	// We don't need any parameter for the constructor, because we already know the name of the book in advance.
	CodeComplete(){
		super("Code Complete.");
	}

//	No description here. We'll see why shortly.
}

public class Main {
	public static void main(String[] args) {

//		for loop to create 10 random books
		for (int i=1; i<=10; i++){

			ProgrammingBooks programmingBooks = randomBook();

//			description() method here shows the usage of polymorphism.
//			When it calls the method, your compiler knows what method suits best for what class
//			and it also passes the 'IS-A' relationship test.
//			Any class that returns true for instanceof, that has a polymorphic form.
			System.out.println("Programming book # "+ i +": " + programmingBooks.getName()
					+"\nDescription: " + programmingBooks.description() + "\n");

		}
	}
	public static ProgrammingBooks randomBook() {
//		It create 5 random numbers, +1 is to add 1 to the 4. because (Math.random()*5) will only create
//		4 numbers from 0-4.
		int randNumber = (int)(Math.random()*5)+1;
		System.out.println("Random number generated was: " + randNumber);
//		switch statement to assign each class to each number for later use.
		switch (randNumber){
			case 1:
				return new EffectiveJava();
			case 2:
				return new IntroToAlgorithms();
			case 3:
				return new TheAreOfComputerProgramming();
			case 4:
				return new CleanCode();
			case 5:
				return new CodeComplete();
		}
//		 If all conditions fail, return null.
		return null;
	}
}