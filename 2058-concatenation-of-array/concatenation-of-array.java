class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length;
       int x = 2*n;
       int[] ans = new int[x]; 
       int m = x/2;

        for(int i = 0; i < x; i++){
            ans[i] = nums[i % n];
        //     ans[i] = nums[i];
        //     m++;
         }
        // for(int i = 0; i < n; i++){
        //     ans[i] = nums[i];
        //     for(int j = m; j < x; j++){
        //         ans[i+m] = nums[i];
        //     }
        // }

        return ans;
    }
}