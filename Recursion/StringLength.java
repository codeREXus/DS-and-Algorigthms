package basic;

public class StringLength {
	public static void main(String [] args) {
		String str= "Annt";
		System.out.println(strLength(str));
	}
	static int strLength(String str) {
		if(str.isEmpty()) {
			return 0;
		}
		return 1+strLength(str.substring(1));
	}
}
