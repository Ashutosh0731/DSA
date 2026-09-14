class Solution {
    public int minPartitions(String n) {
        int max = -1;
        for(int i = 0; i < n.length(); i++){
            int temp = n.charAt(i) - 48;
            System.out.print(temp);
            if(temp > max) max = temp;
        }
        return max;
    }
}