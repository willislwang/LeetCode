/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreePaths {
    /* dude this is beautiful recursion owo
     *
     */
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<String>();
        } else {
            List<String> paths = binaryTreePaths(root.right);
            paths.addAll(binaryTreePaths(root.left));
            if (paths.isEmpty()) {
                paths.add(Integer.toString(root.val));
                
            } else {
               paths = paths.stream().map(x -> Integer.toString(root.val) + "->" + x).collect(Collectors.toList());
            }
            return paths;
        }
        
    }
}
