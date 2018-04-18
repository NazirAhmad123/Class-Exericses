package Plymorphic;


class ProgrammingBooks {
	
	private String name;
	
	ProgrammingBooks(String name){
		this.name = name;
	}
	
	public String description(){
		return "No description here.";
	}

	public String getName(){
		return this.name;
	}
}
class CleanCode extends ProgrammingBooks {

	CleanCode() {
		super("Clean code");
	}
	
	public String description(){
		return "Even bad code can function. ";
	}
}
class CodeComplete extends ProgrammingBooks {

	CodeComplete(String name) {
		super("Code Complete");
	}
	
	public String description(){
		return "Code Complete is a software development book.";
	}
}
class ThePragmaticProgrammer extends ProgrammingBooks{
	ThePragmaticProgrammer(String name) {
		super("Code Complete");
	}
	
	public String description(){
		return "The Pragmatic Programmer.";
	}
	
}

class EffectiveJava extends ProgrammingBooks{
	EffectiveJava(String name) {
		super("Effective Java");
	}
	
	public String description(){
		return "This highly anticipated new edition of the classic.";
	}
}
class LearningPython extends ProgrammingBooks {
	LearningPython(String name) {
		super("Learning Python");
	}
}
public class Main {
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++){
			ProgrammingBooks progBooks = randomProgBooks();
			System.out.println("Book #: " + i + "\n"
					+ progBooks.getName() +":\n "
					+ progBooks.description() +
					"\n");
			
		}
		
	}
	
	public static ProgrammingBooks randomProgBooks() {
		int randomNumber = (int)(Math.random()*5) + 1;
		System.out.println("Random # generated is: " + randomNumber);

		switch(randomNumber){
		case 1:
			return new CleanCode();
		case 2:
			return new CodeComplete(null);
		case 3:
			return new ThePragmaticProgrammer(null);
		case 4:
			return new EffectiveJava(null);
		case 5:
			return new LearningPython(null);
		}
		return null;
	}

}
