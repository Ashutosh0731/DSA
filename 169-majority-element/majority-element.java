class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maj = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int num = n/2;
            num = nums[num];
            return num;
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
        }
        // System.out.println(max);
        return maj;
    }
}