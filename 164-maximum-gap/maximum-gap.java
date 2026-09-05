class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            int diff = nums[i] - nums[i-1];
            if(diff > max){
                max = diff;
            }
        }
        if(n == 1) return 0;
        return max;
    }
}