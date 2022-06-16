package After25_Problems;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Problem_63 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = input.nextInt();
		System.out.println("input the second number: ");
		int b = input.nextInt();
		System.out.println("Result: "+result(a,b));
	}
	public static int result(int x, int y) {
		if(x==y)
			return 0;
			if(x % 6 == y % 6)
				return(x<y)? x:y;
			return(x>y)?x:y;
	}
	
}
