class Solution1 {
    public int maxProfit(int[] prices) {
        int min_price=prices[0];
        int profit=0;
        for(int i=1;i < prices.length;i++){
            min_price=Math.min(min_price,prices[i]);
            profit=Math.max(profit, prices[i]-min_price);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,2,6,4};
        Solution1 s = new Solution1();
        System.out.println(s.maxProfit(prices));
    }
}
