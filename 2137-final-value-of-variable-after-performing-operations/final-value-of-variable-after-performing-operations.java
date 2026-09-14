class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations)
        {
            if(s.charAt(1)=='+') x=x+1;
            else x=x-1;
        }
        return x;
    }
}