package basic;
import java.util.*;
public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sumofDigits(899));
		System.out.println(prodofDigits(789));
	}
	static  int sumofDigits(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sumofDigits(n/10);
	}
	static int prodofDigits(int n) {
		if(n<=9) {
			return n;
		}
		return n%10*prodofDigits(n/10);
	}
}
