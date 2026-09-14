class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations)
        {
            if(s.charAt(1)=='+') x=x+1;
            else x=x-1;
        }
        return x;

        // int x = 0;
        // for(int i = 0; i < operations.length; i++){
        //     if((operations[i].charAt(0) == '+') || (operations[i].charAt(operations[i].length()-1) == '+')) x++;
        //     else if((operations[i].charAt(0) == '-') || (operations[i].charAt(operations[i].length()-1) == '-')) x--;
        // }
        // return x;
    }
}