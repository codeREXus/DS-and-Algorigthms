class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int ans[] = { -1, -1 };
        
        ans[0]=search(arr, target, true);
        ans[1]=search(arr, target, false);
        return ans;
    }

    public int search(int[] arr, int target, boolean flag) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (flag) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
