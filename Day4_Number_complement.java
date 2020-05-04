/*
//1ms
class Solution {
    public int findComplement(int num) {
        char[] s=Integer.toString(num,2).toCharArray();
		for(int i=0;i<s.length;i++) {
			if(s[i]=='0') {
				s[i]='1';
			}
			else {
				s[i]='0';
			}
		}
		String fin=new String(s);
		return Integer.parseInt(fin,2);
    }
}
*/
//0ms
class Solution {
    public int findComplement(int num) {
        int copy=num;
        int sum=0;
        while(num!=0){
            sum=(sum << 1) +1;
            
            num>>=1;
        }
        return (sum-copy);
    }
}