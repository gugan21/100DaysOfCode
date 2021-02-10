https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/585/week-2-february-8th-february-14th/3634/

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
    int sum = 0; 
    
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.right);
        sum+=root.val;
        root.val=sum;
        inorder(root.left);
    }
    
    public TreeNode convertBST(TreeNode root) {
         inorder(root);
        return root;
    }
}
