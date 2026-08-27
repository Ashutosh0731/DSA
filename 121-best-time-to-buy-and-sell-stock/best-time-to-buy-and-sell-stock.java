class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int res = 0;
        for(int i = 0; i < n; i++){
            int sell = prices[i];
            int buy = min;
            if(sell > buy){
                int pro = sell - buy;
                if(pro > res){
                    res = pro;
                }
            }
            if(prices[i] < min) {
                min = prices[i];
            }
        }
        return res;
    }
}

// int max = 0;
// int n = prices.length;
// for(int i = 0; i < n; i++){
//     for(int j = i+1; j < n; j++){
//         if((prices[j] - prices[i]) > 0){
//             if((prices[j] - prices[i]) > max){
//                 max = prices[j] - prices[i];
//             }
//         }
//     }
// }
