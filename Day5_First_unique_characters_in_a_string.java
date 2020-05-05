//7ms
class Solution {
    public int firstUniqChar(String s) {
       int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
/*
//1ms
class Solution {
    public int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        
        for(char c = 'a'; c <= 'z'; c++){
            int index = s.indexOf(c);
            
            if(index != -1 && index == s.lastIndexOf(c))
                res = Math.min(res, index);
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
*/