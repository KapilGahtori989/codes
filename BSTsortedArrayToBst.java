public class BSTsortedArrayToBst {
    private static Node CreateBst(int arr[], int st, int en){
        if(st>en){
            return null;
        }
        int mid = st+(en-st)/2;
        Node root = new Node(arr[mid]);
        root.left=CreateBst(arr, st, mid-1);
        root.right = CreateBst(arr, mid+1, en);
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
    public static void main(String[] args) {
        
        /*
         *          8
         *        /   \
         *       5     11
         *      / \    / \
         *     3   6  10  12
         */
        int arr[] = {3,5,6,8,10,11,12};
        Node root = CreateBst(arr, 0, arr.length-1);
        preOrder(root);
    }
}
