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
    //Iterative solution! trees iteratively monkaS
    //One downside is that this is destructive lmao
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        if (root == null) return traversal;
        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.pop();
            if (curr.left != null) {
                nodes.push(curr);
                nodes.push(curr.left);
                curr.left = null;
            } else {
                traversal.add(curr.val);
                if (curr.right != null) {
                    nodes.push(curr.right);
                }
            }
        }
        return traversal;
    }
}
