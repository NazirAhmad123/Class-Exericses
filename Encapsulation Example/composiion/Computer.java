package sec_02;

public class Computer {
	// Case
	//Monitor
	// MNotherboard
	Case theCase;
	Monitor monitor;
	Motherboard motherboard;
	
	
	public Computer(Case theCase, Monitor monitor, Motherboard motherboard) {
		
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}


	public Case getTheCase() {
		return theCase;
	}


	public Monitor getMonitor() {
		return monitor;
	}


	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	
	
	
	
}
