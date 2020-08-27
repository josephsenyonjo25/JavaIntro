import java.util.Scanner;

public class meterConvert {
	public static void convert (double inch) {
		double meter = 0.0254;
		double result = inch*meter;
		System.out.println(result);
	}
public static void main (String[] args) {
	System.out.println("Enter number of inches");
	Scanner conversion = new Scanner(System.in);
	double inch = conversion.nextDouble();
	
	convert(inch);
}
}
