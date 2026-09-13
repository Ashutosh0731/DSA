class Solution {
    public int[] searchRange(int[] nums, int target) {
        int idx1 = -1;
        int lo = 0, hi = nums.length - 1;
        //First Occurence
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                idx1 = mid;
                hi = mid - 1;
            } else if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        int[] ans = new int[2];
        ans[0] = idx1;
        idx1 = -1;
        lo = 0;
        hi = nums.length - 1;
        // Last Occurence
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                idx1 = mid;
                lo = mid + 1;
            } else if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        ans[1] = idx1;
        return ans;
    }
}