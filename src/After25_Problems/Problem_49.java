package After25_Problems;

import java.util.Scanner;

public class Problem_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = input.nextInt();
		
		if(i%2 ==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
