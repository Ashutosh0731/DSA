class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int left = 0;
            int right = i+1;
            int rightSum = 0;
            int leftSum = 0;
            while(left < right && left != i){
                leftSum += nums[left];
                left++;
            }
            while(right < n && right != i){
                rightSum += nums[right];
                right++;
            }
            if(rightSum == leftSum){
                return i;
            }

        }
        return -1;
    }
}