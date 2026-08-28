class Solution {
    public int majorityElement(int[] nums) {
        // Moore's Voting Alogrithm
        int n = nums.length;
        int freq = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]) freq++;
            else freq--;
        }
        return ans;


        // Second Apporoch
        // int max = 0;
        // for (int i = 0; i < n; i++) {
        //     int count = 0;
        //     for (int j = 0; j < n; j++) { // [2,2,1,1,1,2,2]
        //         if (nums[i] == nums[j])
        //             count++;

        //         }
        //         if (count > n / 2) {
        //             return nums[i];
        //         }

            // My One approach

            // Arrays.sort(nums);
            // for(int i = 0; i < n; i++){
            //     int num = n/2;
            //     num = nums[num];
            //     return num;
            // int count = 0;
            // for(int j = i; j < n; j++){
            //     if(nums[i] == nums[j]){
            //         count++;
            //     }
            //     if(count > max){
            //         max = count;
            //         maj = nums[i];    
            //     }
            // }
            // System.out.println(count);
        // }
        // System.out.println(max);
        // return -1;
    }
}