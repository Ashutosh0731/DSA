class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        int expected = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == expected) {
                expected++;
            }
        }

        return expected;

        // int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     while(nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]){
        //         int correctIdx = nums[i] - 1;//2
        //         int temp = nums[correctIdx]; //2
        //         nums[correctIdx] = nums[i]; //-1
        //         nums[i] = temp; //2
        //     }
        // }
        // for(int i = 0; i < n; i++){
        //     if(nums[i] != i+1){
        //         return i+1;
        //     }
        // }
        // return n + 1;
    }
}