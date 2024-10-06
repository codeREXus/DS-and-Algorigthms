package basic;
import java.util.*;
public class factorial {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find factorial of :");
		int n = sc.nextInt();
		System.out.println(fact(n));
		sc.close();
		
	}
	static int fact(int n ) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
		
	}
}
