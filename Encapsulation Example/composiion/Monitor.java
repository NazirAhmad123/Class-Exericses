package sec_02;

public class Monitor {
	private String model;
	private String manufacturer;
	private Resolution resolution;
	
	
	public Monitor(String model, String manufacturer, Resolution resolution) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.resolution = resolution;
	}
	
	public void drawPixelsAt(int x, int y, String color){
		System.out.println("Drawaing pixels at " + x + ", " + y + " in colour " + color);
	}

	public String getModel() {
		return model;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public Resolution getResolution() {
		return resolution;
	}
	
	
	

}
