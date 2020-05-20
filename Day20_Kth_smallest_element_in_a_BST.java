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
class Solution {
    public int count=0;
    public int kthSmallest(TreeNode root, int k) {
        return kthsmallest(root,k).val;
    }
    public TreeNode kthsmallest(TreeNode root, int k) {
        //System.out.println("i come");
    if(root==null){
        //System.out.println("null    ");
            return null;
        }
        TreeNode left=kthsmallest(root.left,k);
        
        if(left!=null){
            //System.out.println("left    "+root.val);
            return left;
        }
        count++;
       // System.out.println("after count   "+root.val+"      "+count);
        if(count==k){
            return root;
        }
        return kthsmallest(root.right,k);
    }
}