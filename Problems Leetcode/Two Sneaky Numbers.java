class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result= new int[2];
        int cnt=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]==nums[i+1]){
                result[cnt]=nums[i];
                cnt++;
            }
        }
        return result;
    }
}
