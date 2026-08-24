class Solution {
    public int reverse(int x) {
        int org = x;
        int rev = 0;
        while (org != 0) {
            int last = org % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + last;
            org = org / 10;
        }
        return rev;
    }
}