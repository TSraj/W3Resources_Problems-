package First25_Problems;

import java.util.Scanner;

public class Problem_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		System.out.println("Input a number: ");
		num1 = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 + "*" +i+ "= " +(num1*i));
		}
				
	}
}
