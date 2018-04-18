package compExercise;

public class Main {
	public static void main(String[] args) {
		
		Wall wall1 = new Wall("East");
		Wall wall2 = new Wall("West");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		
		Ceiling ceiling = new Ceiling(200, "White");
		Bed bed = new Bed("Classic",4,100,2,2);
		Lamp lamp = new Lamp("Modern", true);
		
		Bedroom myBedroom = new Bedroom("Ali's room"
				, wall1, wall2, wall3, wall4, 
				ceiling, bed, lamp);
		myBedroom.makeBed();
		myBedroom.getLamp().turnOn();
		
		
	}

}
