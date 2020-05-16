class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int a=0,b=0,total=0;
        int maxsum=-3000000,minsum=3000000;
        for(int i=0;i<A.length;i++){
            a=Math.max(a+A[i],A[i]);
            maxsum=Math.max(maxsum,a);
            b=Math.min(b+A[i],A[i]);
            minsum=Math.min(minsum,b);
            total+=A[i];
            
        }
        if(maxsum>0){
            return Math.max(maxsum,total-minsum);
        }
        return maxsum;
    }
}