/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
        let n = nums.length;
        let count = 0;
        let res = 0;

        for(let i = 0; i < n; i++){
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
};