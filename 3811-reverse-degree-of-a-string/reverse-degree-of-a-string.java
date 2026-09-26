class Solution {
    public int reverseDegree(String s) {
        int res= 0;
        for(int i = 1; i<=s.length(); i++){
            res += (26 - (s.charAt(i-1)-'a'))*i;
        }
        return res;
    }
    // public int reverseDegree(String s) {
    //     int sum = 0;
    //     int ans = 0;
    //     for(int i = 0; i < s.length(); i++){
    //         ans = 123 - s.charAt(i);
    //         ans = ans * (i+1);
    //         sum += ans;
    //     }
    //     return sum;
    // }
}