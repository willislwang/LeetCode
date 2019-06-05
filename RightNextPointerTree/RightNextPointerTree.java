/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class RightNextPointerTree {
    public Node connect(Node root) {
        connectHelper(root);
        return root;   
    }
    
    public void connectHelper(Node root) {
        if (root == null) {
            return;
        } else {
            Node leftNode = root.left;
            Node rightNode = root.right;
            while (leftNode != null && rightNode != null) {
                leftNode.next = rightNode;
                System.out.println("connected node " + leftNode.val + " and " + rightNode.val);
                leftNode = (leftNode.right != null) ? leftNode.right : leftNode.left;
                rightNode = (rightNode.left != null) ? rightNode.left : rightNode.right;
            }
            connectHelper(root.left);
            connectHelper(root.right);     
        }
    }
}
