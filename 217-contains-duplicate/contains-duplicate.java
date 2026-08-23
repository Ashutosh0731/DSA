class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;

        // int i = 0;
        // while (i < nums.length) {
        // int j = i+1;
        //     while (j < nums.length) {
        //         if (nums[i] == nums[j])
        //         return true;
        //         j++;
        //     }
        //     i++;
        // }
        // return false;
    }
}