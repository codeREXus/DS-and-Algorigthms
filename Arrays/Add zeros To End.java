class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for (int i : nums) {
            if(i!=0){
      numdstemp++]=i;
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
