class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList();
        int a[]=new int[26];
        
        for(int i=0;i<p.length();i++){
            a[p.charAt(i)-'a']+=1;    
        }
        for(int i=0;i<s.length()-p.length()+1;i++){
            int b[]=new int[26];
            for(int j=i;j<p.length()+i;j++){
                b[s.charAt(j)-'a']+=1;    
        }
            if(Arrays.equals(a,b)){
                list.add(i);
            }
            
        }
        return list;
    }
}