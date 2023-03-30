// Problem Statement: Calculate Power of two numbers i.e. a^b
// Approach: Recursion

package recursion;

public class CalculatePower {
	
	static int stepCnt = 0;
	
	//if a=3 and b=4
	// then 3*3*3*3=81
	public static void main(String[] args) {
		System.out.println(power(3,10));
		System.out.println("Steps: "+stepCnt);
	}
	
	// recursive method
	static int power(int a, int b) {
		System.out.println(b);
		stepCnt++;
		
		// base case
		// a=3 and b=0
		// then 3^0=1
		// i.e power(3,0)
		if(b==0) {
			return 1;
		}
		
		// recursive call
		// power(3,3)*3=power(3,4)
		// where power(3,3) is recursive leap of faith
		return a * power(a,b-1);
	}
}
