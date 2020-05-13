class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k){
            return "0";
        }
        else if(k==0){
            return num;
        }
        int p=0;
        String nums=find(num,k,p);
        if(nums.length()>1){
        int i=0;
        for(i=0;i<nums.length();i++){
            if(nums.charAt(i)!='0'){
                break;
            }
            else if(i==nums.length()-1){
                return nums.substring(i);
            }
        }
        return nums.substring(i);
        }
        return nums;
    }

public String find(String num,int k, int p){
        for(int i=0;i<num.length();i++){
            if(i==num.length()-1){
                num=num.replaceFirst(String.valueOf(num.charAt(i)),"");
                p=p+1;
                
            }
            else if(num.charAt(i)>num.charAt(i+1)){
                num=num.replaceFirst(String.valueOf(num.charAt(i)),"");
                p=p+1;
                break;
                
            }
        }
        if(p==k){
            return num;
        }
    
    return find(num,k,p);
        
        
                                     
    }
}