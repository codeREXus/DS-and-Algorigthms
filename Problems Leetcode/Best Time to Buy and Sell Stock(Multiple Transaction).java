class Solution {
    public int maxProfit(int[] prices) {
        int res =0;
       for(int i=1; i< prices.length;i++){
           if(prices[i]>prices[i-1]){
               res+=prices[i]-prices[i-1];
           }
       }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution s = new Solution();
        System.out.println(s.maxProfit(prices));
    }
}
