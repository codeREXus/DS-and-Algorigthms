package basic;

public class RevNum {
	public static void main(String [] args) {
		System.out.println(revNum(234));
	}
	static int revNum(int n ) {
		if(n%10==n) {
			return n;
		}
		return revNum(n/10)	+(n%10);
	}
}
