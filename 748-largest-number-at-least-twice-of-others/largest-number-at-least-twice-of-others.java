class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int idx = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
                idx = i;
            }
        }
        for(int i = 0; i < n; i++){
            if((max < nums[i]*2) && (i != idx)){
                return -1;
            }
        }
        return idx;
    }
}