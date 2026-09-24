class Solution {
    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

        int n = nums[i];
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }

            if (sum == i) {
                return i;
            }
        
        }
        return -1;


        // int n = nums.length;
        // int min = -1;
        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     int a = nums[i];
        //     while(a != 0){
        //         int lastDig = a % 10;
        //         sum += lastDig;
        //         a = a/10;
        //     }
        //     if(sum == i){
        //         return i;
        //     } 
        //     System.out.println("sum -> "+sum+" i->"+i);
        // }
        // return min;
    }
}