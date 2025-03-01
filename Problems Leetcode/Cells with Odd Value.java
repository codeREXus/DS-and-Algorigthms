class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [] [] ans= new int[m][n];
        for(int i =0;i<indices.length;i++){
            for(int j=0 ;j<n;j++){
                ans[indices[i][0]] [j]++;
            }
            for(int j=0;j<m;j++){
                ans[j] [indices[i][1]]++;
            }
        }
        int count=0;
        for(int i =0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                if(ans[i][j]%2==1){
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int[][] indices = {{0,1},{1,1}};
        Solution s = new Solution();
        System.out.println(s.oddCells(m,n,indices));
    }
}
