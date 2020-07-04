import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        Scanner sc=new Scanner(System.in);
        int no=x;
        int num=no;
        boolean t;
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev= rev*10+temp;
            num=num/10;
        }
        if(rev==no){
            t=true;
        }
        else t=false;
        return t;
    }
}