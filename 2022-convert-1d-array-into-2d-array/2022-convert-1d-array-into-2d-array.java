class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
         if (original.length != m * n) {
    return new int[0][0];
}
       
        int [][] arr= new int [m][n];
        int s = original.length;
               int k = 0;
            for(int j =0; j<m ; j++){
                for(int i =0; i<n ; i++){
                    arr[j][i] = original[k];
                    k++;

                }
            }
       
         return arr; 
        
    }
}