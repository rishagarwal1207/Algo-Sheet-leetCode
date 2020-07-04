class Solution {
    public boolean isValid(String s) {
        boolean b=false;
        int c=0;
        int n=s.length();
        if(s.equals("")){
            b=true;
        }
        else if(n%2!=0){
            b=false;
        }
        else{
         Stack<Character> st= new Stack<>();
            for(int i=0;i<n;i++){
           
             if(i>n-1){
                    b=false;
                     continue;
             }
           
             else if( s.charAt(i)=='('||  s.charAt(i)=='['||  s.charAt(i)=='{'){
                 st.push(s.charAt(i));
                    System.out.println(s.charAt(i));

                 }
                 if(st.isEmpty()){
                          System.out.println(s.charAt(i));
                          b=false;

                        break;
                        }
             
                 if(( s.charAt(i)==')' && st.peek()=='(')||( s.charAt(i)==']' &&  st.peek()=='[') ||( s.charAt(i)=='}' &&  st.peek()=='{'))
                        {   
                           
                            System.out.println(s.charAt(i)+" "+st.pop());
                            b=true;
                            System.out.println(b);

                                 continue;
                        }
                        else if(( s.charAt(i)==')') ||( s.charAt(i)==']' )||( s.charAt(i)=='}')){
                            b=false;
                            c=1;
                        }
                        else{
                            b=false;
                        }

                       
            }
            }
        if(c==1){
            b=false;
        }
        return b;
    } 
    
   
}
