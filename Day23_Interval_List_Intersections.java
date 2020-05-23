class Solution {
   
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> list=new ArrayList();
        for(int i=0;i<A.length;i++) {
        	for(int j=0;j<B.length;j++) {
        		if((A[i][0]<=B[j][0] && A[i][1]>=B[j][0]) || (A[i][0]>=B[j][0] && A[i][1]<=B[j][1])
        				 || (A[i][0]<=B[j][1] && A[i][1]>=B[j][1])) {
        			int a=A[i][0]<=B[j][0]?B[j][0]:A[i][0];
        			int b=A[i][1]<=B[j][1]?A[i][1]:B[j][1];
        			int[] c= {a,b};
        			list.add(c);
        		}
        		
        	}
        }
        int[][] res=new int[list.size()][2];
        for(int i=0;i<list.size();i++) {
        	
        	res[i]=list.get(i);
        }
        return res;
    }
}