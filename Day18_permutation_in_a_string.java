class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        
        
        if(s2.length()<s1.length()){
            return false;
        }
         int a[]=new int[26];
        if(s2.length()==s1.length()){
             for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']+=1;
                 a[s2.charAt(i)-'a']-=1;
        }
        for(int j=0;j<26;j++){
            if(a[j]!=0){
                   return false;
               }
            }
            return true;
        }
    
       
        
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']--;
            a[s2.charAt(i)-'a']++;
            
        }
        int p=1;
        for(int j=0;j<26;j++){
            if(a[j]!=0){
                p=0;
                break;
               }
            }
            if(p==1){
            return true;
            }
            
        for(int i=s1.length();i<s2.length();i++){
            p=0;
            a[s2.charAt(i)-'a']++;
            a[s2.charAt(i - s1.length())-'a']--;
            for(int j=0;j<26;j++){
                if(a[j]!=0){
                    p=1;
                    break;
                }
            }
            if(p==0){
                return true;
            }
        }
        return false;
     
    }
}