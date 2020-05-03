class Solution {
    public static final int v=26;
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        	int[] alpha=new int[v];
		for(char c:ransomNote.toCharArray()) {
			alpha[c-'a']-=1;
		}
		for(char c:magazine.toCharArray()) {
			alpha[c-'a']+=1;
		}
		for(int i:alpha) {
			if(i<0) {
				return false;
			}
		}
		
		return true;
    }
}