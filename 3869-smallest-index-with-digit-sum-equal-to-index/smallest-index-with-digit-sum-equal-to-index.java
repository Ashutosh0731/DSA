class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int min = -1;
        for(int i = 0; i < n; i++){
            int sum = 0;
            int a = nums[i];
            while(a != 0){
                int lastDig = a % 10;
                sum += lastDig;
                a = a/10;
            }
            if(sum == i){
                return i;
            } 
            System.out.println("sum -> "+sum+" i->"+i);
        }
        return min;
    }
}