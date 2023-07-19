import java.util.*;
public class q2 {
	public static int getPentagonalNumber(int n) {
		int result = n*(3*n - 1)/2;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number you want to display");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int ans = getPentagonalNumber(i);
			System.out.print(ans+" ");
			if(i % 10 == 0) {
				System.out.println();
			}
		}

	}

}
