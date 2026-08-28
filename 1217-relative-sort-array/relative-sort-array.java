class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
    int n = arr1.length;
    int m = arr2.length;
    Arrays.sort(arr1);
    int k = 0;
    
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(arr2[i] == arr1[j]){
                int temp = arr1[k];
                arr1[k] = arr1[j];
                arr1[j] = temp;
                k++;
            }
            
        }
    }
    Arrays.sort(arr1, k, n);    
    return arr1;
    }      
}