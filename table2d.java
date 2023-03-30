package basic;

import java.util.Scanner;

public class table2d {

	public static void main(String[] args) {
                System.out.println("Enter The Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}

	}

}
