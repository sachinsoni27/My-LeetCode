class Solution {
    public int countDigits(int num) {
        int count =0;
        int nn=num;
        while(num!=0){
          int ans = num%10;
          if(nn%ans==0){
            count++;
          }
                    num=num/10;

          }
                  return count;

        }
        
    }
