package abstract_;

import java.util.Scanner;

interface MyRobot {
//	public abstract void dance();
	void dance();

//	Create a basic calculator with +,-,*,/,%
//	Create an abstract class Calculator
//	abstract Calculator {}
//	calculate extends Calculator{}
//	methods->abstract void add(int a,int b),sub,mul,div;
//	Main. -> ask for two integers.
//	for the input entered. do the 5 operations.
}

class MyRobotImplementation implements MyRobot {
	public void dance(){
		System.out.println("Dancing...");
		
	}
}
abstract class Robot {
	private String name;
	
	Robot(String name){
		this.name = name;
	}
	
	public void walk(){
		System.out.println("Walking...");
	}
	public abstract void talk();
	public abstract void eat();
	public abstract void sleep();
}
abstract class RobotV2 extends Robot {
	
	RobotV2(){
		super("Robot");
	}
	public void talk(){
		System.out.println("Talking...");
	
	}
}
// A class without abstract keyword is called concrete class
// A concrete class must implement all the abstract methods
class RobotV3 extends RobotV2 {
	RobotV3(){
		super();
	}
	public  void eat(){
		System.out.println("Eating ...");	
	}
	public  void sleep(){
		System.out.println("Sleeping ...");
	}
}
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
//		Robot robot = new RobotV2();
//		Robot robot = new RobotV3();
//		robot.eat();
//		robot.sleep();
//		robot.talk();
//		robot.walk();
//		MyRobotImplementation mrrobot = new MyRobotImplementation();
//		mrrobot.dance();
		calculator calc = new calculate();
		System.out.print("Enter two integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println("Addition: " +calc.Addition(a,b));
		System.out.println("Subtraction: " +calc.Subtraction(a,b));
		System.out.println("Addition: " +calc.Multiplication(a,b));
		System.out.println("Division: " +calc.Division(a, b));
		System.out.println("Remainder: " + calc.Remainder(a, b));
		calc.something();
		
		
		
	}

	
}
