class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        // Algorithm 1 Swapping
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                i++;
            }

        }

        // Alogrithm 2 Copy Zero

        // for(int j = 0; j < n;j++){
        //     if(nums[j] != 0){
        //         nums[i] = nums[j];
        //         i++;
        //     }
        // }

        // while(i < n){
        //     nums[i] = 0;
        //     i++;
        // }
    }
}