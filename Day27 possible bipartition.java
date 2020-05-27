class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        //3ms
        int []group=new int[N+1];
        for(int i=0;i<=N;i++){
            group[i]=i;
        }
        for(int[] a:dislikes){
            int first=a[0];
            int second=a[1];
            if(group[first]==first && group[second]==second){
                group[first]=second;
                group[second]=first;
                
            }
            if(group[first]!=first && group[second]==second){
                group[second]=group[group[first]];
            }
            if(group[first]==first && group[second]!=second){
                group[first]=group[group[second]];
                
            }
            if(group[first]==group[second]){
                return false;
            }
        }
        return true;
        //400ms
        /*
        if(N==1){
            return true;
        }
        int a=0,b=0,c=0;
        List<Integer> group1=new ArrayList();
        List<Integer> group2=new ArrayList();
        
        group1.add(dislikes[0][0]);
        group2.add(dislikes[0][1]);
        for(int i=1;i<dislikes.length;i++) {
        	if(group1.contains(dislikes[i][0]) ){
        		if(group1.contains(dislikes[i][1])) {
        			return false;
        		}
        		if(group2.contains(dislikes[i][1])) {
        			continue;
        		}
        		else {
        			group2.add(dislikes[i][1]);
        		}
        	}
        	else if(group2.contains(dislikes[i][0])){
        		if(group2.contains(dislikes[i][1])) {
        			return false;
        		}
        		if(group1.contains(dislikes[i][1])) {
        			continue;
        		}
        		else {
        			group1.add(dislikes[i][1]);
        		}
        		
        	}
        	else if(group1.contains(dislikes[i][1])) {
        		if(!group2.contains(dislikes[i][0])) group2.add(dislikes[i][0]);
        	}
        	else if(group2.contains(dislikes[i][1])) {
        		if(!group1.contains(dislikes[i][0])) group1.add(dislikes[i][0]);
        	}
        	else{
                if(a==b){
                    a=dislikes[i][0];
                    b=dislikes[i][1];
                    continue;
                }
                if(a==dislikes[i][0]){
                    if(c==dislikes[i][1]){
                        return false;
                    }
                    c=dislikes[i][1];
                }
                if(b==dislikes[i][0]){
                    if(c==dislikes[i][1]){
                        return false;
                    }
                    c=dislikes[i][1];
                }
            }
        	//System.out.println(group1+"  "+group2);
        }
        return true;4*/
    }
}