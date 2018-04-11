package sec_02;

public class Main {
	public static void main(String[] args) {
		//System.out.println("Hello world!");
//		Player p1 = new Player();
//		
//		p1.PlayerName = "Ahmad";
//		p1.weapon = "Sword";
//		p1.health = 20;
//		
//		int damage = 10;
//		
//		p1.loseHealth(damage);
//		System.out.println("Remaining health is: " +
//		p1.remainingHealth());
//		
//		damage = 12;
//		p1.health = 1000;
//		p1.loseHealth(damage);
//		System.out.println("Remaining health is: " +
//		p1.remainingHealth());
		//https://github.com/NazirAhmad123
//		EnhancedPlayer p2 = new EnhancedPlayer("Ali",500, "sword");
//		System.out.println("Remaining health is: " + p2.getHealth());
//	
	//Printer p = new Printer(50, true);
//	Printer p = new Printer(50, false);
//	
//	int printThisAmount = p.printPages(4);
//	System.out.println("Pages printed: "+printThisAmount
//			+"\nNew total: " + p.getPagesPrinted());
//		
//		
//		
//	printThisAmount = p.printPages(8);	
//	System.out.println("Pages printed: "+printThisAmount
//			+"\nNew total: " + p.getPagesPrinted());	
//		
		
		
		Dimension dimension = new Dimension(20,20,5);
		Case theCase = new Case("BC234","Asus", dimension);
		
		
		Monitor monitor = new Monitor("VNHG34","Dell",new Resolution(1200,1200));
		
		Motherboard motherboard = new Motherboard("CZ324","Acer");
		
		Computer myPc = new Computer(theCase,monitor, motherboard);
		theCase.pressPowerButton();
		monitor.drawPixelsAt(125, 123, "blue");
		motherboard.loadProgram("Windows 8.1");
		
	
	}

}
