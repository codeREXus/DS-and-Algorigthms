package basic;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		System.out.println(isPrime(n,2));
	}
	static boolean isPrime(int n,int i) {
		if(i>n/2) {
			return true;
		}
		if(n%i==0) {
			return false;
		}
		return isPrime(n,i+1);
		
	}

}
