package basic;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		int a = 0, b = 1, c = 0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i = 2; i < n; i++) {
			
			c = a + b;
			a = b;
			b = c;
			
			System.out.print(c+" ");
			
		}

	}

}
