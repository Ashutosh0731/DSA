class Solution {
    public int[] buildArray(int[] nums) {
        
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        for(int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        System.gc();
        return nums;
        
        // int[] ans = nums.clone();
        // for(int i = 0; i < nums.length; i++){
        //     ans[i] = nums[nums[i]];
        // }
        // return ans;
    }
}