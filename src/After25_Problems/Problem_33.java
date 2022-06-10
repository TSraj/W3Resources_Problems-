package After25_Problems;

import java.util.Scanner;

public class Problem_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n;
		
		System.out.println("Enter a number: ");
		n = input.nextLong();
		System.out.println("The sum of the digits is: "+sumDigits(n));
	}
	public static int sumDigits(long n) {
		int sum =0;
		while (n!=0) {
			sum +=n%10;
			n/=10;
		}
		return sum;
	}
}
