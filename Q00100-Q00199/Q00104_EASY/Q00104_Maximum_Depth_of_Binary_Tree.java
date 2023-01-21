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
    public int maxDepth(TreeNode node) {
        if(node == null){
            return 0;
        }
        int leftSearch = maxDepth(node.left);
        int rightSearch = maxDepth(node.right);
        return Math.max(leftSearch,rightSearch)+1;
    }
}