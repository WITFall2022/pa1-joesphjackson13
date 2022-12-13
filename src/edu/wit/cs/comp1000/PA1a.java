package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this 
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);

		int yard;
		System.out.printf( "Enter yard: ");
		yard = input.nextInt();
		
		int feet;
		System.out.printf("Enter feet: ");
		feet = input.nextInt();
		
		int inches;
		System.out.printf("Enter inches: ");
		inches = input.nextInt();
	
		int ans; 
		ans = yard*36+feet*12+inches*1;
	
		
		System.out.printf("Total number of inches",ans = yard*36+feet*12+inches*1);
	}

}

