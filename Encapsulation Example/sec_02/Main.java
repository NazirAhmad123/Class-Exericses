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
//		
		EnhancedPlayer p2 = new EnhancedPlayer("Ali",500, "sword");
		System.out.println("Remaining health is: " + p2.getHealth());
	}

}
