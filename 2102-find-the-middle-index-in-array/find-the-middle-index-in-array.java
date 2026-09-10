class Solution {
    public int findMiddleIndex(int[] nums) {

        int totalSum = 0;

        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }

        int leftSum = 0;

        for(int i = 0; i < nums.length; i++){

            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;



        // int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     int left = 0;
        //     int right = i+1;
        //     int rightSum = 0;
        //     int leftSum = 0;
        //     while(left < right && left != i){
        //         leftSum += nums[left];
        //         left++;
        //     }
        //     while(right < n && right != i){
        //         rightSum += nums[right];
        //         right++;
        //     }
        //     if(rightSum == leftSum){
        //         return i;
        //     }

        // }
        // return -1;
    }
}