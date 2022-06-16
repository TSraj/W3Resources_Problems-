package After25_Problems;

import java.util.Scanner;

public class Problem_62 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int x = input.nextInt();
		System.out.println("Enter second number: ");
		int y = input.nextInt();
		System.out.println("Enter third number: ");
		int z = input.nextInt();
		System.out.println((Math.abs(x-y)>=20 || Math.abs(y-z)>=20 || Math.abs(z-x)>=20));
	}
}
