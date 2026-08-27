class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {

                int j = n - 1;

                while (nums[j] <= nums[i]) {
                    j--; // bas j ko move karo
                }

                swap(nums, i, j); // while KHATAM hone ke baad swap
                reverse(nums, i + 1, n - 1);
                return;
            }
        }
        reverse(nums, 0, n - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int i, int j) {
    while (i < j) {
        swap(nums, i, j);
        i++;
        j--;
    }
}
}