package First25_Problems;

import java.util.Scanner;

public class Problem_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, add, sub, mul, div, mod;
		
		System.out.print("Input first number: ");
		num1 = input.nextInt();
		System.out.print("Input second number: ");
		num2 = input.nextInt();
		
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		mod = num1%num2;
		
		System.out.println("125+24 = "+add);
		System.out.println("125-24 = "+sub);
		System.out.println("125*24 = "+mul);
		System.out.println("125/24 = "+div);
		System.out.println("125%24 = "+mod);
	}
}
