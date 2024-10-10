package BinarySearch;

public class FloorNumber {
	public static void main(String[] args) {
		int [] arr= {12,23,34,44,53};
		int target=53;
		int ans=0;
		ans=orderAgnosticBinarySearch(arr, target);
		System.out.println("floor of the number is "+ans);
	}
	static int orderAgnosticBinarySearch(int[] arr , int target) {
		int start=0;
		int end=arr.length-1;
		if(target<arr[start])
			return -1;
		boolean check=arr[start]>arr[end];
			while(start<=end) {
				int mid=0;
				mid= start+(end-start)/2;
				if(arr[mid]==target) {
					return arr[mid];
				}
				if(check)
				{					
					if(arr[mid]>target) {
						start=mid+1;
					}
					else
						end=mid-1;
				}
				else {
					
					if(arr[mid]<target) {
						start=mid+1;
					}
					else
						end=mid-1;
				}
			}
		return arr[end];
	}
}
