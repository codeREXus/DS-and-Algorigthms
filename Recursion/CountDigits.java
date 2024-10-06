package basic;

public class CountDigits {
	public static void main(String[] args) {
		System.out.println(Count(9023));
	}
	static int count =0;
	static int Count(int n ) {
		if(n==0) {
			return count;
		}
		count++;
		return Count(n/10);
	}
}
