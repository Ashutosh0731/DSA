class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int cal = 0;
            for(int j = 0; j < accounts[0].length; j++){
                cal += accounts[i][j];
                if(cal > max) max = cal;
            }
        }
        return max;  
    }
}