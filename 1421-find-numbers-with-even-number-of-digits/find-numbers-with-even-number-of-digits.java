class Solution {
    public int findNumbers(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int temp = nums[i];
            int num = 0;
            while(temp != 0){
                temp = temp / 10;
                num++;
            }
            if(num % 2 == 0){
                count++;
            }
        }
        return count;
    }
}