/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=1;
        int j=n;
        
        while(i<j){
        int midpoint=i+ (j-i)/2;
        if(!isBadVersion(midpoint)){
        i=midpoint+1;
        }
        else{
           j=midpoint;
        }
        
        }
        
        return i;
    }
}
