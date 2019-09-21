package amer_p1;
import java.util.Scanner;

public class encryption {
	public static void main (String args[]) {
		
		int firstDig, secondDig, thirdDig, fourthDig, num, temp;
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter four digit number: ");
		num = scnr.nextInt();
		
		firstDig = num / 1000;
		secondDig = num / 100 % 10;
		thirdDig = num / 10 % 10;
		fourthDig = num % 10;
		
		firstDig = (firstDig + 7) % 10;
		secondDig = (secondDig + 7) % 10;
		thirdDig = (thirdDig + 7) % 10;
		fourthDig = (fourthDig + 7) % 10;
		
		temp = firstDig;
		firstDig = thirdDig;
		thirdDig = temp;
		
		temp = secondDig;
		secondDig = fourthDig;
		fourthDig = temp;
		
		System.out.println("Encrypted number: " + firstDig + secondDig + thirdDig + fourthDig);
		scnr.close();
	}
	
}










