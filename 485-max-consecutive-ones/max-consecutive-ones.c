int findMaxConsecutiveOnes(int* nums, int numsSize) {
     int n = numsSize;
        int count = 0;
        int res = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                count++;
            }
            if(nums[i] == 0){
                count = 0;
            }
            if(count > res){
                res = count;
            }
        }
        return res;
}