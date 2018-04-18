package compExercise;

public class Animal {
//	Would you please listen. Tq
	private String name;
	
	public void walk(){
		System.out.println("I am a generic animal"
				+ "I don't walk in a specific way.");
	}
}
class Elephant extends Animal {
	
	public void walk(){
		System.out.println("I am an elephant,"
				+ "I walk slowely." );
	}
}
class Fox extends Animal {
	public void walk(){
		System.out.println("I am a Fox,"
				+ "I walk Faster." );
	}
}
class Cat extends Animal {
	public void walk(){
		System.out.println("I am a Cat,"
				+ "I walk slowely." );
	}
}
class Shark extends Animal {
	public void walk(){
		System.out.println("I am a Shark,"
				+ "I swim." );
	}
}
class Butterfly extends Animal {
	public void walk(){
		System.out.println("I am a Butterfly,"
				+ "I fly." );
	}
}

