class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] j=J.toCharArray();
        int p=0;
        ArrayList lis=new ArrayList();
        for(char c:j){
            lis.add(c);
        }
        char[] s=S.toCharArray();
        for(int i=0;i<s.length;i++){
            if(lis.contains(s[i])){
                p=p+1;
            }
        }
        return p;
    }
}