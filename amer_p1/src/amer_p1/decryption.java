package amer_p1;

import java.util.Scanner;

public class decryption {
	public static void main(String args[]) {
		
		int firstDig, secondDig, thirdDig, fourthDig, num, temp;
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter four digit number: ");
		num = scnr.nextInt();
		
		firstDig = num / 1000;
		secondDig = num / 100 % 10;
		thirdDig = num / 10 % 10;
		fourthDig = num % 10;
		
		if (firstDig < 7 && firstDig >= 0)
		{
			firstDig += 10;
		}
		if (secondDig < 7 && secondDig >= 0)
		{
			secondDig += 10;
		}
		if (thirdDig < 7 && thirdDig >= 0)
		{
			thirdDig += 10;
		}
		if (fourthDig < 7 && fourthDig >= 0)
		{
			fourthDig += 10;
		}
		
		firstDig -=7;
		secondDig -=7;
		thirdDig -=7;
		fourthDig -=7;
		
		temp = firstDig;
		firstDig = thirdDig;
		thirdDig = temp;
		
		temp = secondDig;
		secondDig = fourthDig;
		fourthDig = temp;
		
		System.out.println("Decrypted number: " + firstDig + secondDig + thirdDig + fourthDig);
		scnr.close();
		
	}
}
