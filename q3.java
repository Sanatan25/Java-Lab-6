import java.util.*;
public class q3 {
	public static int reverse(int n) {
		int rev =0;
		while(n > 0) {
			int digits = n%10;
			rev = (rev*10)+digits;
			n/=10;
		}
		return n;
	}
	public static boolean isPalindrome(int n) {
		if(reverse(n)==n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if(isPalindrome(a)) {
			System.out.println(a+" is palindrome");
		}else {
			System.out.println("is not palindrome");
		}

	}

}
