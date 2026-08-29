class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;

        int sum = nums[0];
        int prevSum = nums[0];

        for (int i = 1; i < n; i++) {

            if (sum + nums[i] > nums[i]) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }

            if (sum > prevSum) {
                prevSum = sum;
            }
        }

        return prevSum;

        //    int n = nums.length;
        //    int sum = nums[0];
        //    int prevSum = 0;

        //    for(int i = 1; i < n; i++){
        //         if(sum + nums[i] > sum){
        //             sum += nums[i];

        //             if(sum > prevSum){
        //                 prevSum = sum;
        //             }
        //         }
        //     } 
        //    return prevSum;
    }
}