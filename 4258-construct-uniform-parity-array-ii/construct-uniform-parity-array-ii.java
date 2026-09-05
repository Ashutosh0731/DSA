class Solution {
    public boolean uniformArray(int[] nums1) {

        int min = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int i = 0; i < nums1.length; i++) {
            min = Math.min(min, nums1[i]);

            if (nums1[i] % 2 != 0) {
                hasOdd = true;
            }
        }

        if (min % 2 != 0) {
            return true;
        }

        return !hasOdd;
    }
}