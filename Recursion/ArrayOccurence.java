package basic;

public class ArrayOccurence {
	public static void main(String[] args) {
		int[] arr= { 12,23,23,23,12};
		int target=12;
		System.out.println(arrayOccurence(arr, target,0));
	}
	static int count=0;
	static int arrayOccurence(int[] arr, int target,int n) {
		if(n<arr.length)
		{
			if(arr[n]==target)
				count++;
			return arrayOccurence(arr, target,n+1);
		}
			return count;
		
	}
}
