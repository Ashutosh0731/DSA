class Solution {
    public int thirdMax(int[] nums) {
       
        int n = nums.length;
        long max = Long.MIN_VALUE;
        long sMax = Long.MIN_VALUE;
        long thMax = Long.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                thMax = sMax;
                sMax = max;
                max = nums[i];
            }
            if(nums[i] > sMax && nums[i] < max){
                thMax = sMax;
                sMax = nums[i];
            }
            if((nums[i] > thMax) && (nums[i] < sMax) && (nums[i] < max)){
                thMax = nums[i];
            }
        }
        
        if(thMax == Long.MIN_VALUE){
            return (int)max;
        }

        return (int)thMax;
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // int n = nums.length;
        // int max = nums[0];
        // int sMax = Integer.MIN_VALUE;
        // int thMax = Integer.MIN_VALUE;

        // for(int i = 0; i < n; i++){
        //     if(nums[i] > max){
        //         sMax = max;
        //         max = nums[i];
        //     }
        //     if(nums[i] > sMax && nums[i] < max){
        //         thMax = sMax;
        //         sMax = nums[i];
        //     }
        //     if((nums[i] > thMax) && (nums[i] < sMax) && (nums[i] < max)){
        //         thMax = nums[i];
        //     }
        // }
        // if(thMax == Integer.MIN_VALUE) return max;
        // else return thMax;
    }
}