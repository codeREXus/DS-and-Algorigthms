class Solution {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            while(0<nums[i] && nums[i]<=n && nums[i]!= nums[nums[i]-1])
            {
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i =1;i<=n;i++){
            if(i!=nums[i-1]){
                return i;
            }
        }
        return n+1;
    }
}
