class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int y=image[sr][sc];
        image[sr][sc]=newColor;
        if(y==newColor){
            return image;
        }
        return fill(image,sr,sc,newColor,y);
    }
    public int[][] fill(int[][] image, int sr, int sc, int newColor,int set){
        if(sr+1<image.length){
        if(image[sr+1][sc]==set){
            
            image[sr+1][sc]=newColor;
            image=fill(image,sr+1,sc,newColor,set);
        }
        }
        if(sc+1<image[0].length){
        if(image[sr][sc+1]==set){
           
            image[sr][sc+1]=newColor;
            image=fill(image,sr,sc+1,newColor,set);
        }
        }
        
        if(sr-1>=0){
        if(image[sr-1][sc]==set){
            
            image[sr-1][sc]=newColor;
            image=fill(image,sr-1,sc,newColor,set);
        }
        }
        if(sc-1>=0){
        if(image[sr][sc-1]==set){
           //System.out.println(image[sr][sc-1]);
            image[sr][sc-1]=newColor;
            image=fill(image,sr,sc-1,newColor,set);
        }
        }
       
        return image;
    }
}