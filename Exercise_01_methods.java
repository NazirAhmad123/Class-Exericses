


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Sum of all the digits
		// Sum of the first and last digit
		// sum of odd digits
		// sum of even digits
		// the smallest digit
		// the largest digit
		// the reverse of the number
		System.out.println("Enter a #: ");
		int num = in.nextInt();
		System.out.println("Sum of the digits is: " + sumOfDigits(num));
		System.out.println("Sum of first and last the digits is: " + sumOfFirstAndLastDigit(num));
		System.out.println("Sum of odd digits is: " + sumOfOddDigits(num));
		System.out.println("Sum of Even digits is: " + sumOfOddEvens(num));
		System.out.println("Smallest digits is: " + smallestDigit(num));
		System.out.println("Largest digits is: " + largestDigit(num));
		reverse(num);
	System.out.println("Reverse : " + reverseSecond(num));
	
	}
	public static int sumOfDigits(int num){
		int sum=0;
		while(num!=0){
			int remainder = num%10;
			sum+=remainder;
			num = num/10;
//			
		}
		return sum;
	}
	public static int sumOfFirstAndLastDigit(int num){
		
		int lastDigit = num%10;
		
		int rev = 0;
		while(num!=0){
			int remainder = num%10;
			rev = rev*10+remainder;
			num/=10;
		}
		int firstDigit = rev%10;
		int sum = firstDigit + lastDigit;
		return sum;
	}
	public static int sumOfOddDigits(int num){
		
		int sum = 0;
		while(num!=0){
			int remainder = num%10;
//			Check if the last digit is odd number
			if(remainder % 2 != 0){
				sum+=remainder;
			}
			num/=10;
		}
		return sum;
	}
public static int sumOfOddEvens(int num){
		
		int sum = 0;
		while(num!=0){
			int remainder = num%10;
//			Check if the last digit is odd number
			if(remainder % 2 == 0){
				sum+=remainder;
			}
			
			num = num/10;
		}
		return sum;
	}
	//the smallest digit
public static int smallestDigit(int num){
	// this gives us the last digit
	// We assume this as our smallest digit
	int min = num%10;
	
	
	while(num!=0){
		int remainder = num%10;
		// Compare all the digits with min. (last digit).
		if(remainder < min){
			min = remainder;
		}
		num/=10;
	}
	// returns the minimum digit in the number
	return min;
	
}
//the largest digit
public static int largestDigit(int num){
	// this gives us the last digit
	// We assume this as our largest digit
	int max = num%10;
	
	
	while(num!=0){
		int remainder = num%10;
		// Compare all the digits with max. (last digit).
		if(remainder > max){
			max = remainder;
		}
		num/=10;
	}
	// returns the maximum digit in the number
	return max;
	
	}
// two ways of returning the reverse of the number
// First: using void method.
	public static void reverse(int num){
		while(num!=0){
			int remainder = num%10;
			System.out.print(remainder);
			num/=10;
		}
		System.out.println();
	}
	// Second: using int.
	public static int reverseSecond(int num){
		int rev = 0;
		while(num!=0){
			int remainder = num%10;
			rev = rev*10+remainder;
			num/=10;
		}
		return rev;
	}
	
}

