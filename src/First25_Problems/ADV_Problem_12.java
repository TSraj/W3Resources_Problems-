package First25_Problems;

import java.util.Scanner;

public class ADV_Problem_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num=0;
		double x=1;
		
		System.out.println("Enter the number you want to calculate average: ");
		int n = input.nextInt();
		
		while (x<=n) {
			System.out.println("Input number " + "("+(int) x +")" + ":");
			num += input.nextInt();
			x +=1;
		}
		double average = (num/n);
		System.out.println("Average is: "+average);
	}
}
