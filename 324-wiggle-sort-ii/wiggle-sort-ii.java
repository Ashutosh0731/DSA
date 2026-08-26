class Solution {
    public void wiggleSort(int[] nums) {
        // int n = nums.length;

        // Sort the array
        // Arrays.sort(nums);

        // int[] temp = nums.clone();

        // int mid = (n + 1) / 2;
        // int j = mid - 1;   // smaller half ka end
        // int k = n - 1;     // larger half ka end

        // for (int i = 0; i < n; i++) {
        //     if (i % 2 == 0) {
        //         nums[i] = temp[j--];
        //     } else {
        //         nums[i] = temp[k--];
        //     }
        // }




         int n = nums.length;

        Arrays.sort(nums);

        int mid = (n + 1) / 2;

        // First half ko reverse
        reverse(nums, 0, mid - 1);

        // Second half ko reverse
        reverse(nums, mid, n - 1);

        int[] temp = nums.clone();

        int i = 0;
        int j = mid;

        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                nums[k] = temp[i++];
            } else {
                nums[k] = temp[j++];
            }
        }
    }
    public void reverse(int nums[], int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}