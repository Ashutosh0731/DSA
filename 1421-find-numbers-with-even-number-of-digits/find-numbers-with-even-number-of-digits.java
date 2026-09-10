class Solution {
    public int findNumbers(int[] nums) {

        int v=0;
        for(int x:nums){
            if(((int)Math.log10(x)%2==1))v++;
        }
        return v;

        // int count = 0;

        // for(int i = 0; i < nums.length; i++) {

        //     if((nums[i] >= 10 && nums[i] <= 99) ||
        //        (nums[i] >= 1000 && nums[i] <= 9999) ||
        //        nums[i] == 100000) {

        //         count++;
        //     }
        // }

        // return count;

        // int n = nums.length;
        // int count = 0;
        // for(int i = 0; i < n; i++){
        //     int temp = nums[i];
        //     int num = 0;
        //     while(temp != 0){
        //         temp = temp / 10;
        //         num++;
        //     }
        //     if(num % 2 == 0){
        //         count++;
        //     }
        // }
        // return count;
    }
}