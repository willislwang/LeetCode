/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.lang.Integer;
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        else if (root.left == null && root.right == null) {
            return true;
        }
        return isValidBST(root, -2147483648, 2147483647, true, true);
    }
    public boolean isValidBST(TreeNode root, int minVal, int maxVal, boolean initMin, boolean initMax) {
        if (root == null) {
            return true;
        } else {
            return (initMax || root.val < maxVal) && (initMin || root.val > minVal) && isValidBST(root.left, minVal, root.val, initMin, false) && isValidBST(root.right, root.val, maxVal, false, initMax);
        }
    }
}
