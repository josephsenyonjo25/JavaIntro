package productMultiply;

import java.util.Scanner;

public class ProductMultiply {
	public static double product(double input1, double input2) {
		double answer = input1*input2;
		return answer;
	}
public static void main (String[] args) {
	System.out.println("Enter first number:");
	Scanner output = new Scanner (System.in);
	double input1 = output.nextDouble();
	System.out.println("Enter second number:");
	double input2 = output.nextDouble();
	double result = product(input1, input2);
	
	System.out.println("The answer is: " + result);
}
}
