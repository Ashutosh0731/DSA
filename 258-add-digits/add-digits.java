class Solution {
    public int addDigits(int num) {
        int temp = 0, sum = 0;
        int i = 0;

        while (num != 0) {
            temp = num % 10; // 8,3
            num = num / 10; // 3,0
            sum += temp; // 8+3 = 11
            i++; // 2
        }


        while (sum >= 10) {
            num = sum;
            sum = 0;

            while (num != 0) {
                temp = num % 10; // 1,1
                num = num / 10; // 1,0
                sum += temp; // 1+1 = 2

            }
        }
        return sum;
    }
}