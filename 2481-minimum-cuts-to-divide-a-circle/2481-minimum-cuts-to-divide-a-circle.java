class Solution {
    public int numberOfCuts(int n) {
        int line =0;
        if(n == 1){
            return 0;
        }
        if(n%2==0){
            line = n/2;
        }
        else{
            line = n;
        }
        return line;
    }
}