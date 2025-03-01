public class CircularSubarraySum {
    public static void main(String[] args) {
        int [] nums = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxCircularSum(nums));
    }
    static int maxCircularSum(int [] nums){
        int n = nums.length;
        int[] suff_sum = new int[n];
        suff_sum[n - 1] = nums[n - 1];
        int temp = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            temp += nums[i];
            suff_sum[i] = Math.max(temp, suff_sum[i + 1]);
        }
        int circ_sum = nums[0];
        int normal_sum = nums[0];
        int prefix = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = Math.max(curr_sum + nums[i], nums[i]);
            normal_sum = Math.max(normal_sum, curr_sum);
            prefix += nums[i];
            if (i < n - 1) {
                circ_sum = Math.max(circ_sum, prefix + suff_sum[i + 1]);
            }
        }
        return Math.max(circ_sum, normal_sum);
    }
}
