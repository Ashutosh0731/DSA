class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int count = 0;
        int res = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                count++;
            }
            if(nums[i] == 0){
                count = 0;
            }
            if(count > res){
                res = count;
            }
        }
        return res;













    //     int res = 0;
    //     int count = 0;

    //     for (int n : nums) {
    //         if (n == 0) {
    //             count = 0;
    //         } else {
    //             count++;
    //         }

    //         if (res < count) {
    //             res = count;
        //     }
        // }

        // return res;        
    }
}