class Solution {
    public boolean isPowerOfTwo(int n) {
        int num=-1;
        boolean b=false;
        while(n>1){
            num=n%2;
            if(num==0){
                 n=n/2;
            }
            else break;
        }
        if(n==1){
            b=true;
        }
        else if(num==0)
        {b=true;}
        else
        {b=false;}
        return b;
        }
    
    }