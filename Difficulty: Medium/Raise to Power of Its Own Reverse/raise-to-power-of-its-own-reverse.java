class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int org = n ;
        int rev=0;
        
         while(n>0){
             int rem = n%10;
            rev = rev*10+ rem ;
            n = n/10;
         }
         return (int)Math.pow(org, rev);    
        }
 
    }

