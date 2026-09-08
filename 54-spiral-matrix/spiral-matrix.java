class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;
        int firstCol = 0, lastCol = m-1;
        int firstRow = 0, lastRow = n-1;
        
        while((firstCol <= lastCol) && (firstRow <= lastRow)){

            //Right
            for(int j = firstCol; j <= lastCol; j++){
                ans.add(matrix[firstRow][j]);
            }
            firstRow++;
            if(firstRow > lastRow || firstCol > lastCol){
                break;
            }

            //Down
            for(int i = firstRow; i <= lastRow; i++){
                ans.add(matrix[i][lastCol]);
            }
            lastCol--;
            if(firstRow > lastRow || firstCol > lastCol){
                break;
            }
            
            //left
            for(int j = lastCol; j >= firstCol; j--){
                ans.add(matrix[lastRow][j]);
            }
            lastRow--;
            if(firstRow > lastRow || firstCol > lastCol){
                break;
            }

            //UP
            for(int i = lastRow; i >= firstRow; i--){
                ans.add(matrix[i][firstCol]);
            }
            firstCol++;
            if(firstRow > lastRow || firstCol > lastCol){
                break;
            }
        }
        return ans;
    }
}