class Solution {
    public static int[] rowSum(int mat[][]) {
        int[]ans = new int[mat.length];
        // Code here
         for( int i=0; i < mat.length; i++ ){
             int sum =0; 
             for( int j =0 ; j < mat[0].length ; j++ ){
                 sum += mat[i][j];
             }
             ans[i] = sum;
         }
        return ans ;
        
    }
}