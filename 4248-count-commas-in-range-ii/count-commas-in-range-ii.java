class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long commaStart = 1000;

        while (commaStart <= n) {
            ans += n - commaStart + 1;
            commaStart *= 1000;
        }

        return ans; 
    }
}