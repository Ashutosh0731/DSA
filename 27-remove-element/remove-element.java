class Solution {
    public int removeElement(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;

        // int n = nums.length;

        // int i = 0;
        // int count = 0;
        // for(int j = 1; j < n; j++){
        //     if(nums[i] != val) i++;
        //     if(nums[i] == val && nums[j] != val){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         i++;
        //         count = i;
        //     }
        // }
        // return i;
    }
}