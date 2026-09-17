class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;
        int[] ans = new int[n];

        int index = 0;

        // pivot se chhote
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                ans[index] = nums[i];
                index++;
            }
        }

        // pivot ke equal
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                ans[index] = nums[i];
                index++;
            }
        }

        // pivot se bade
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) {
                ans[index] = nums[i];
                index++;
            }
        }
        
        return ans;
    }
}