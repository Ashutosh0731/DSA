class Solution {
    public int singleNumber(int[] nums){
        int xor = 0;
        for(int ele : nums){
            xor ^= ele;
        }
        return xor;
    }



    // public int singleNumber(int[] nums) {

    //     int ans = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         ans = ans ^ nums[i];
    //     }

    //     return ans;
    // }
}