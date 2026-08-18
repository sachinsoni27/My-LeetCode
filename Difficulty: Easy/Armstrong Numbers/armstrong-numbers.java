class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int temp =n;
        int count =0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int Sum = Sum(n,count);
        
        if (Sum == original) {
            return true;
        } else {
            return false;
        }
        
    }
        
         
        public static int Sum(int n,int count){
        int sum =0;
       while(n>0){
           int rem = n%10;
           sum = sum + (int)Math.pow(rem,count); 
             n = n/10;
       }
       return sum;
        }
    
}