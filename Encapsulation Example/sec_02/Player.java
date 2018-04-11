package sec_02;

public class Player {
	public String PlayerName;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage){
		
		this.health = this.health - damage;
		if(this.health <= 0){
			System.out.println("Player knocked out.");
//			sdfgdgs
		}
	}
	public int remainingHealth(){
		return this.health;
	}

}
