package After25_Problems;

import java.util.Iterator;
import java.util.Scanner;

public class Problem_61 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word;
		System.out.println("Enter the word: ");
		word = input.nextLine();
		
		word = word.trim();
		String result =" ";
		char[] ch = word.toCharArray();
		
		for (int i = ch.length-1; i >=0; i--) {
			result+=ch[i];
		}
		System.out.println("The reverse word: "+result.trim());
	}
}
