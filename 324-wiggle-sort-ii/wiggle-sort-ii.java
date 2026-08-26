class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        // Sort the array
        Arrays.sort(nums);

        int[] temp = nums.clone();

        int mid = (n + 1) / 2;
        int j = mid - 1;   // smaller half ka end
        int k = n - 1;     // larger half ka end

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = temp[j--];
            } else {
                nums[i] = temp[k--];
            }
        }
    }
}