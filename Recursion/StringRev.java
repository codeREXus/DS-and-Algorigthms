package basic;

public class StringRev {
	public static void main(String[] args) {
		String str="KLOMP";
		System.out.println(revStr(str,str.length()-1));
	}
	
	static String revStr(String str,int l) {
		if(l<0) {
			return "";
		}
		return Character.toString(str.charAt(l))+revStr(str,l-1);
	}
}
