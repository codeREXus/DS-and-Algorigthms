package basic;

public class MaxArray {
	public static void main(String [] args) {
		int [] arr= {12,34,23,54,23,1223,44n};
		System.out.println(maximum(arr,arr.length-1));
	}
	static int max=0;
	static int maximum(int [] arr, int l) {
		if(l<1) {
			return max;
		}
		max= Math.max(arr[l],arr[l-1]);
		return Math.max(max,maximum(arr,l-1));
	}
}
