package amer_p3;

import java.util.Scanner;

public class poll {
	
	static String[] topics = {"sports", "women's rights", "racism", "taco tuesdays", "area 51"};
	static int[][] responses = new int[5][10];
	
	public static void main(String args[]) {
		double[] sum = new double[] {0, 0, 0, 0, 0};
		double avg = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("On a scale 1-10, rate the issue: " + (j + 1) + ". " + topics[j]);
				responses[j][i] = scnr.nextInt();
			}
		}
		
		System.out.println("Responses:");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("\n" + (i + 1) + "." + topics[i]);
			for (int j = 0; j < 10; j++) {
				System.out.print(responses[i][j] + "\t");
				sum[i] += responses[i][j];
			}
			
			avg = sum[i] / 10;
			System.out.print("Average: " + avg);
		}
		
		double max = sum[0], min = sum[0];
		int maxi = 0, mini = 0;
		
		for (int i = 0; i < 5; i++) {
			if (max < sum[i]) {
				max = sum[i];
				maxi = i;
			}
			
			if (min > sum[0]) {
				min = sum[0];
				mini = i;
			}
		}
		
		System.out.println("Highest polled issue: " + topics[maxi] + "\tRatings: " + max);
		System.out.println("Lowest polled issue: " + topics[mini] + "\tRatings: " + min);
		
		scnr.close();
	}

}
