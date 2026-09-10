class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        while(left <= right){

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                ans[idx] = leftSquare;
                left++;
            }
            else{
                ans[idx] = rightSquare;
                right--;
            }

            idx--;
        }

        return ans;

        // int n = nums.length;

        // for(int i = 0; i < n; i++){
        //     nums[i] = (int)Math.pow(nums[i],2);
        // }
        // Arrays.sort(nums);
        // return nums;
    }
}