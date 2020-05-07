/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//0ms
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
         if(x==y){
            return false;
        }
        else if(root.val==x || root.val==y ){
            return false;
            
        }
        int xx[]= find(root,x,0);
        int yy[]=find(root,y,0);
        //System.out.println(xx+" "+yy);
        if(xx[0]!=yy[0] && xx[1]==yy[1] ){
            return true;
        }
        else{
            return false;
        } 
    }
    public int[] find(TreeNode root, int x,int m) {
       int c[]=new int[]{-1,0};
        if(root.left!=null){
            
            if(root.left.val==x){
                return new int[] { root.val,m};
            }
            
            c=find(root.left,x,m+1);
        }
        if(root.right!=null && c[0]==-1){
            
            if(root.right.val==x){
                return new int[] { root.val,m};
            }
            
            c=find(root.right,x,m+1);
        }
            
        return c;
        
    }
}