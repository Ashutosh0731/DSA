class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        slow = nums[0];

        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;


        // Second Approach
        // int n = nums.length;
        // int[] freq = new int[n+1];

        // for(int num : nums){
        //     if(freq[num]++ == 1) return num;
        // }
        // System.gc();
        // return -1;

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