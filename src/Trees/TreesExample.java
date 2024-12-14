package Trees;

public class TreesExample {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.left.right.left = new TreeNode(70);
        root.left.right.right = new TreeNode(80);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(60);

        TreeTraversal obj = new TreeTraversal();
        obj.inOrderTraversal(root);
        System.out.println();
        obj.preOrderTraversal(root);
        System.out.println();
        obj.postOrderTraversal(root);
    }
}
