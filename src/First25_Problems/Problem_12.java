package First25_Problems;

import java.util.Scanner;

public class Problem_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num1, num2, num3, average;
		
		System.out.println("Enter number one: ");
		num1 = input.nextDouble();
		System.out.println("Enter number two: ");
		num2 = input.nextDouble();
		System.out.println("Enter number Three: ");
		num3 = input.nextDouble();
		
		average = (num1+num2+num3)/3;
		System.out.println("Average is: "+average);
	}
}
