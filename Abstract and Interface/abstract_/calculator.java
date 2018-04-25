package abstract_;

abstract class calculator {
	
	abstract int Addition(int num1, int num2);
	abstract int Subtraction(int num1, int num2);
	abstract int Multiplication(int num1, int num2);
	abstract int Division(int num1, int num2);
	abstract int Remainder(int num1, int num2);
	public void something(){
		System.out.println("Something");
	}
	
}class calculate extends calculator {
	
	public int Addition(int num1, int num2){
		return num1+num2;
	}
	public int Subtraction(int num1, int num2){
		return num1-num2;
	}
	public int Multiplication(int num1, int num2){
		return num1*num2;
	}
	public int Division(int num1, int num2){
		return num1/num2;
	}
	public int Remainder(int num1, int num2){
		return num1%num2;
	}
}
