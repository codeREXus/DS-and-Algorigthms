
class twosum {
    public static void twoSum(int[] nums, int target) {
        int i=0,j=0;
        for(i=0;i<nums.length;i++){
            for(j=1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
       
    }
    
public static void main(String[] args)
    {
    	int nums[]={23,34,45,6,57,89};
        int tar=57;
        twoSum(nums,tar);
    }
}
