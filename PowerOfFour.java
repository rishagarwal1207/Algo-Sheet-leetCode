class Solution {
    public boolean isPowerOfFour(int num) {
        int n=-1;
        boolean b=false;
        while(num>1){
            n=num%4;
            if(n==0){
                 num=num/4;
            }
            else break;
        }
        if(num==1){
            b=true;
        }
        else if(n==0)
        {b=true;}
        else
        {b=false;}
        return b;
    }
}