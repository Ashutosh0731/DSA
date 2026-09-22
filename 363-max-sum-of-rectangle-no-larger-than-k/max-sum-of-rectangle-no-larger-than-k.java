class Solution {

    public int maxSumSubmatrix(int[][] matrix, int k) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int ans = Integer.MIN_VALUE;

        for (int left = 0; left < cols; left++) {

            int[] rowSum = new int[rows];

            for (int right = left; right < cols; right++) {

                // left se right tak row-wise sum
                for (int r = 0; r < rows; r++) {
                    rowSum[r] += matrix[r][right];
                }

                // rowSum ke saare subarrays check karo
                for (int i = 0; i < rows; i++) {

                    int sum = 0;

                    for (int j = i; j < rows; j++) {

                        sum += rowSum[j];

                        if (sum <= k) {
                            ans = Math.max(ans, sum);
                        }
                    }
                }
            }
        }
        return ans;
    }
}