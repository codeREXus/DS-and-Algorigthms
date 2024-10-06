package basic;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		System.out.println(sumArray(arr,arr.length-1));
	}
	static int sumArray(int [] arr, int l) {
		if(l<0) {
			return 0;
		}
		return arr[l]+sumArray(arr,l-1);
	}

}
