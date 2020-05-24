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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=construct(preorder,0,preorder.length-1);
        return root;
    }
    public TreeNode construct(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode node=new TreeNode(preorder[start]);
        int i;
        for(i=start;i<=end;i++){
            if(preorder[i]>node.val){
                break;
            }
        }
        node.left=construct(preorder,start+1,i-1);
        node.right=construct(preorder,i,end);
        return node;
    }
}
        /*
        if(preorder.length==1){
            TreeNode rot=new TreeNode(preorder[0]);
            return rot;
        }
        int i=0;
        TreeNode rot=new TreeNode(preorder[i]);
        find(rot,i,preorder);
        return rot;
    }
    public void find(TreeNode rot,int i,int[] preorder){
        if( rot!=null){
            System.out.println("f");
        int j=i+1;
             if(i+1<preorder.length-1){
        if(preorder[i+1]<rot.val)rot.left=new TreeNode(preorder[i+1]);
        
             
       
           System.out.println(rot.val+" left");
        find(rot.left,i+1,preorder);
           System.out.println("s");
            if(rot.left!=null){
        for(j=i+1;j<preorder.length;j++){
            if(preorder[j]>rot.val){
                break;
            }
        }
            }
            if(rot.left!=null || i==0){
        rot.right=new TreeNode(preorder[j]);
             System.out.println(rot.val+" right"+rot.right.val);
               
             find(rot.right,j,preorder);
            }
        }
            else{
                System.out.println("ffff");
                if(preorder[i+1]>rot.val){
                    
                    rot.right=new TreeNode(preorder[i+1]);
                }
                if(preorder[i+1]<rot.val){
                    rot.left=new TreeNode(preorder[i+1]);
                }
            }
            }
    }
    
}
*/