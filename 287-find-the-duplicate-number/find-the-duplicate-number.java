class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n+1];

        for(int num : nums){
            if(freq[num]++ == 1) return num;
        }
        return -1;

        // Second Approach

        // int count = 0;
        // for(int i = 0; i < n; i++){
        //     freq[nums[i]]++;
        // }
        // for(int i = 0; i < freq.length; i++){
        //     if(freq[i] > 1){
        //         count = i;
        //         System.out.print(freq[i]+" ");
        //     }
        // }
        // return count;
    }
}