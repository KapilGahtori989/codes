import java.util.ArrayList;

public class BSTConvertBstToBalancedBst {
    private static Node CreateBst(ArrayList<Integer> inorder,int st, int en){
        if(st>en){
            return null;
        }
        int mid = st+(en-st)/2;
        Node root = new Node(inorder.get(mid));
        root.left=CreateBst(inorder, st, mid-1);
        root.right = CreateBst(inorder, mid+1, en);
        return root;
    }

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right =null;
        }
    }
    private static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preOrder(root.left);
        preOrder(root.right);
        
    }
    private static void getInOrder(Node root, ArrayList<Integer> inOrder){
        if(root==null){
            return;
        }
        getInOrder(root.left, inOrder);
        inOrder.add(root.data);
        getInOrder(root.right, inOrder);

    }

    private static Node balancedBst(Node root){
        //inOrder Sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);

        //sorted inorder->Balanced Bst
        root = CreateBst(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
         /*
                     8
                   /   \
                  6     10
                 /       \
                5         11 
               /           \
              3             12
            given BST
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /*
                     8
                   /   \
                  5     11
                 / \    / \
                3   6  10 12   
            expected BST
         */
        root = balancedBst(root);
        preOrder(root);

    }
}
