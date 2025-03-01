class Solution3{
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        Solution3 s = new Solution3();
        int[] ans = s.buildArray(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
