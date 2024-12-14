package Trees;

public class TreeTraversal {

    // Two types of traversals Breadth First and Depth First
    // In Depth First we have three types
    // 1.Inorder - left root right
    // 2.Preorder - root left right
    // 3.Postorder - left right root

    public void inOrderTraversal(TreeNode root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.key+" ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root){
        if(root!=null){
            System.out.print(root.key+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root){
        if(root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.key+" ");
        }
    }
}
