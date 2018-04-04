package mypackage;

public class Main {
	public static void main(String[] args) {
		Outlander outlander = new Outlander(60);
		outlander.steer(45);
		outlander.accelerate(10);
		outlander.accelerate(15);
		outlander.accelerate(-15);
	}
}
