/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isReverseTree(root.right, root.left);
    }
    public boolean isReverseTree(TreeNode rightTree, TreeNode leftTree) {
        if (rightTree == null && leftTree == null) {
            return true;
        } else if (rightTree == null || leftTree == null || rightTree.val != leftTree.val) {
            return false;
        } else {
            return isReverseTree(rightTree.right, leftTree.left) && isReverseTree(rightTree.left, leftTree.right);
        }
    }
}
