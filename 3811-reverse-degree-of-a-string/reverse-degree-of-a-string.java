class Solution {
    public int reverseDegree(String s) {
        int count = 0;
        int in = 0;
        for(int i = 0; i < s.length(); i++){
            in = 123 - s.charAt(i);
            in = in * (i+1);
            count += in;
        }
        return count;
    }
}