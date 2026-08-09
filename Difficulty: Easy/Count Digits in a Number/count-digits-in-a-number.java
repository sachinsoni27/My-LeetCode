class Solution {
    public static int countDigits(int n) {
        // Code here
        long count =0;
          while( n !=0){
              int ans =n%10;
                  count++;
                   n=n/10;
          }
          return (int)count;
    }
}

