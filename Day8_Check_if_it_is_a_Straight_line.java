//0ms
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2){
            return true;
        }
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        int x2=coordinates[1][0];
        int y2=coordinates[1][1];
        int m=0;
        try{
        m=(y2-y1)/(x2-x1);
        }
        catch(Exception e){
            return false;
        }
        for(int[] z:coordinates){
            if((z[1]-y1)!=m*(z[0]-x1)){
                return false;
            }
        }
        return true;
    }
}