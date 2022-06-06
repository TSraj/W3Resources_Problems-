package First25_Problems;

import java.util.Scanner;

public class Problem_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, result;
		System.out.print("Input first number: ");
		num1 = input.nextInt();
		System.out.print("Input second number: ");
		num2 = input.nextInt();
		
		result = num1* num2;
		System.out.println("25*5 = "+result);
	}
}
