class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for (int i : nums) {
            if(i!=0){
                nums[temp++]=i;
            }
        }
        for(int i= temp;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i: nums){
            System.out.print(i+',');
        }
    }
}
