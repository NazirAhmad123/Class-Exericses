package compExercise;

public class Lamp {
//	Style, battery
	private String style;
	private boolean battery;
	
	Lamp(String style, boolean battery){
		this.style = style;
		this.battery = battery;
	}
	public void turnOn(){
		System.out.println("Turning on the lamp.");
		
	}

}
