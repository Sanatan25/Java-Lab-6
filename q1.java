import java.util.*;
public class q1 {
	public static int aditionSimple(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static int substractionSimple(int a,int b) {
		int sub = b-a;
		return sub;
	}
	
	public static int multiplicationSimple(int a,int b) {
		int mul = a*b;
		return mul;
	}
	
	public static double division(int a, int b) {
		if(b > 0) {
			double div = a/b;
		}
		return a/b;
	}
	public static double remainder(int a, int b) {
		int rem = a%b;
		return rem;
		
	}
	public static double squareroot(int a) {
		double sq = Math.sqrt(a);
		return sq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println(aditionSimple(5,10));

	}

}
