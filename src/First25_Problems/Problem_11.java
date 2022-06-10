package First25_Problems;

import java.util.Scanner;

public class Problem_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radious, perimeter, area;
		System.out.println("Enter the radious: ");
		radious = input.nextDouble();
		
		perimeter = 2*3.1416*radious;
		area = 3.1416*radious*radious;
		
		System.out.println("Perimeter is: "+perimeter);
		System.out.println("Area is: "+area);
	}
}
