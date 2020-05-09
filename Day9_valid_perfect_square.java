class Solution {
    public boolean isPerfectSquare(int num) {
       /*
        double n=Math.pow(num,0.5);
        if(Math.floor(n)==n){
            return true;
        }
        return false;
        */
        //0ms
        long i=0;
        long j=num;
        
        while(j>=i){
            long mid=i+(j-i)/2;
            if(mid * mid == num){
                return true;
            }
            else if(mid * mid < num){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
        
    }
    
}
    