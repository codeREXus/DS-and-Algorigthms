package BinarySearch;
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,23,34,44,53};
		int target=34;
		int ans=0;
		//if the order of the array is known
		ans=binarySearch(arr,target);
		System.out.println(ans+1);
		//if the order of the array is unknown
		ans=orderAgnosticBinarySearch(arr, target);
		System.out.println(orderAgnosticBinarySearch(arr, target)+1);
	}
	static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length;
		while(start<end) {
			int mid= start+ (end-start)/2;
			if(arr[ mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	static int orderAgnosticBinarySearch(int[] arr , int target) {
		int l= arr.length-1;
		int start=0; int end=l;
		boolean check=arr[start]>arr[end];
			while(start<=end) {
				int mid=0;
				mid= start+(end-start)/2;
				if(arr[mid]==target) {
					return mid;
				}
				if(!check)
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
		return -1;
	}
}

