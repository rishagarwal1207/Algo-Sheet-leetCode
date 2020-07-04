public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    int res=0;
    for(int i=0;i<32;i++){
        res<<=1;
        
        res=res+n%2;
       
        n>>>=1; //unsigned no uses logical op >>> divides by 2
       
    }
       
    return res;

}
}