class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {//0,1,2,3
            int min = Integer.MAX_VALUE;
            int col = -1;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {//3,6,1
                    min = matrix[i][j]; // 1
                    col = j;//1
                }
            }
            int max = Integer.MIN_VALUE;
            for (int k = 0; k < matrix.length; k++) {
                max = Math.max(max, matrix[k][col]);
            }
            if (min == max) {
                list.add(min);
            }
            
        }
        return list;

        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0; i < matrix.length; i++){
        //     int min = Integer.MAX_VALUE;
        //     int max = Integer.MIN_VALUE;
        //     for(int j = 0; j < matrix[0].length; j++){
        //         min = Math.min(matrix[i][j], min);
        //         if(min == matrix[i][j]){
        //             for(int k = i; k <= i; k++){
        //                 max = Math.max(matrix[k][j], max);
        //                 if(max == matrix[k][j]){
        //                     list.add(matrix[i][j]);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return list;
    }
}