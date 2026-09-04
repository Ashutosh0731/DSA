class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int ans = -1;

        for(int i = 0; i < n; i++){

            int min = Integer.MAX_VALUE;
            int val = nums[i];
            max  = Math.max(val, max);

            for(int j = i; j < n; j++){

                int m = nums[j];
                min = Math.min(m, min); 
            }
            System.out.print(min+" ");
            int diff = max - min;
            if(diff <= k){
                ans = i;
                break;
            }
        }
        return ans;
    }
}