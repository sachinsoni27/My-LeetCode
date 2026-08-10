class Solution {
    public int diagonalSum(int[][] mat) {
 
        int totalsum = 0;
        int nonDiagonal = 0;
     for ( int i =0 ; i <mat.length; i++){
       
        for( int j=0 ; j < mat[0].length ;  j++){
                      totalsum += mat[i][j];
                      if(!(i==j) && !(i + j == mat.length - 1) ){
                          nonDiagonal += mat[i][j];
                      }  
        }
          
     }
        return totalsum - nonDiagonal; 
    }

}