class Solution {
    public String addStrings(String num1, String num2) {
        int l= num1.length()-1; 
        //String s="";
        int l1=num2.length()-1;
        int carry=0;
        int dig=0;
        StringBuilder sb=new StringBuilder();
       while(l>=0 || l1>=0){ 
          
        int x= (l>=0)?Character.getNumericValue(num1.charAt(l--)):0;
        int y= (l1>=0)?Character.getNumericValue(num2.charAt(l1--)):0;
        System.out.println(x+" "+y);
        int sum=carry+x+y;
        System.out.println(sum);
            dig= sum%10;
          
            carry= sum/10;
             System.out.println(carry);
           sb.append(dig);
              
       
        }
           if(carry > 0){                  
            sb.append(carry);
            
        }
           
       System.out.println(sb);  
        
     return sb.reverse().toString();   
    }
}