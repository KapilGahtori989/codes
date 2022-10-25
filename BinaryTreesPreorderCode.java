import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreesPreorderCode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.left =null;
            this.right = null;
        }
    }

   static class BinaryTree{
        static int idx=-1;
        private static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        private static void preOrder(Node root){
           if(root==null){
            // System.out.print(-1+" ");
            return;
           }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        private static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        private static void postOrder(Node root){
            if(root ==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        private static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        private static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh)+1;
        }
        private static int count(Node root){
            if(root==null){
                return 0;
            }
            int lc = count(root.left);
            int rc = count(root.right);
            return lc+rc+1;
        }

        private static int sum(Node root){
            if(root==null){
                return 0;
            }
            int ls = sum(root.left);
            int rs = sum(root.right);

            return ls+rs+root.data;
        }
    }
    public static void main(String[] args) {
        //time complexity---O(n)
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);--you should call static functions in static way

        
        Node root =BinaryTree.buildTree(nodes);
        System.out.println("post order-------");
        BinaryTree.preOrder(root);
        System.out.println();
        System.out.println("in order-----");
        BinaryTree.inOrder(root);
        System.out.println();
        System.out.println("post order------");
        BinaryTree.postOrder(root);
        System.out.println();
        System.out.println("Level order--------");
        BinaryTree.levelOrder(root);

        //max height of the tree
        System.out.println("height of tree = "+BinaryTree.height(root));

        //count of roots
        System.out.println("number of nodes "+BinaryTree.count(root));

        //sum of nodes
        System.out.println("sum of roots = "+ BinaryTree.sum(root));
    }
}
