class Solution {
    public int findJudge(int N, int[][] trust) {
        return find(trust,N,N);
    }
    public int find(int[][] trust, int n,int x){
        
        if(n==0){
            return -1;
        }
        for(int[] p:trust){
            if(p[0]==n){
                
                return find(trust,n-1,x);
            }
        }
        int y=0;
        for(int[] p:trust){
            if(p[1]==n){
                
                y=y+1;
            }
        }
        if(y==x-1){
            return n;
        }
        
        return find(trust,n-1,x);
    }
}