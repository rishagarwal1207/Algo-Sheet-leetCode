class Solution {
    public int lengthOfLongestSubstring(String s) {
         Map<Character,Integer> seen=new HashMap<>();
        
        int begin = 0, end = 0;
        int len = 0;
        
        String ans = "";
        
        while(end < s.length()){
            char current = s.charAt(end);
            
            if(seen.contains(current) && seen.getValue(end) == 1 && end>= begin){
                begin = end + 1;
            }
            else{
                seen.put(current,end);
                end++;            
            }
            
            if(end - begin > len){
                len = end - begin;
                ans = s.substring(begin, end - begin);
            }
        }
           
           
          
        return len;
    }
}