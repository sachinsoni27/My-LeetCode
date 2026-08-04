class Solution {
    void segregate0and1(int[] arr) {
        int zeros =0;
        int ones  = 0;
        
        for(int ele : arr){
            if(ele == 0){
                zeros++;
                
            }else{
                ones++;
            }
        }
        int i =0;
        while(zeros > 0){
            arr[i]= 0;
            i++;
            zeros--;
        }
        while(ones>0){
            arr[i]=1;
            i++;
            ones--;
        }
        
    }
}
