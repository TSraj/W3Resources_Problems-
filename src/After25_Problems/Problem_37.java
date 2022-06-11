package After25_Problems;

import java.util.Iterator;
import java.util.Scanner;

public class Problem_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		char[] letters = input.nextLine().toCharArray();
		
		System.out.println("The reverse string: ");
		for (int i= letters.length -1; i>=0; i--) {
			System.out.println(letters[i]);
		}
		System.out.println("\n");
	}
}
