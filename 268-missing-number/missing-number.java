class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2; // 3
        int arrSum = 0;
        for(int ele : nums){
            arrSum += ele; //2
        }
        return sum-arrSum; // 3-1
    }
}