class Solution {
    public int findNumbers(int[] nums) {
        int temp=0;
        for(int i:nums){
            if((int)(Math.log10(i)+1)%2==0)
            temp++;
        }
                System.gc();

        return temp;
    }
}
