package amer_p2;

import java.util.Scanner;

public class BMI {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		double first_bmi = user(scnr);
		report(first_bmi);
	}
	
	public static double user(Scanner scnr) {
		System.out.print("Weight in lbs: ");
		double weight = scnr.nextDouble();
		System.out.print("Height in inches: ");
		double height = scnr.nextDouble();
		
		return bmi(height, weight);
	}
	
	public static double bmi(double height, double weight) {
		return (weight * 703 / (height * height));
	}
	
	public static void report(double bmi) {
		System.out.println("BMI = " + bmi);
		
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}

}
