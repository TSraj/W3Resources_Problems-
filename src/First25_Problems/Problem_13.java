package First25_Problems;

import java.util.Scanner;

public class Problem_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double width, height;
		
		System.out.println("Enter the width: ");
		width = input.nextDouble();
		System.out.println("Enter the height: ");
		height = input.nextDouble();
		
		double area = width*height;
		double perimeter = 2*(width+height);
		
		System.out.println("The area is: "+area);
		System.out.println("The perimeter is: "+perimeter);
	}
}
