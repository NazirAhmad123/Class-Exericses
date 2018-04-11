package sec_02;

public class Motherboard {
	private String model;
	private String manufacturer;
	
	Motherboard(String model,String manufacturer){
		this.model = model;
		this.manufacturer = manufacturer;
	}
	public void loadProgram(String programName){
		System.out.println(programName + " is now loading...");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	

}
