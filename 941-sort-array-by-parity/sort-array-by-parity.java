class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;

            }
        }
        return nums;

        // int[] ans = new int[nums.length];
        // int j = nums.length-1;
        // int k = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] % 2 == 0){
        //         ans[k] = nums[i];
        //         k++;
        //     }
        //     else{
        //         ans[j] = nums[i];
        //         j--;
        //     }
        // }
        // return ans;
    }
}