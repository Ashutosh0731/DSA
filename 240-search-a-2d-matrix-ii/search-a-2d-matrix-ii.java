class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = n-1;
        // TC => O(m+n); best
        while(i < m && j >= 0){
            if(matrix[i][j] > target) j--;
            else if(matrix[i][j] < target) i++;
            else return true;
        }
        return false;
        
        // TC = O(m*n) wrost
        // int n = matrix.length;
        // int m = matrix[0].length;

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(matrix[i][j] == target) return true;
        //     }
        // }
        // return false;
    }
}