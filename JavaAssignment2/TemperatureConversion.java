package JavaAssignment2;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Temperature in Celsius");
		double celsius=sc.nextDouble();
		double Fahrenheit=(1.8)*celsius+32;
		System.out.println("Your Temperature in Fahrenheit = "+Fahrenheit);
	}

}
