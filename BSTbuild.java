import java.util.ArrayList;

public class BSTbuild{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
{
    this.data = data;
}    }

public static Node insert(Node root, int val){
    if(root==null){
        root = new Node(val);
        return root;
    }
    if(root.data>val){
        //left subtree
        root.left=insert(root.left, val);
    }else{
        //right subtree
        root.right = insert(root.right, val);
    }
    return root;
    
}

private static void inOrder(Node root){
    if(root ==null){
        return;
    }
    inOrder(root.left);
    System.out.println(root.data+" ");
    inOrder(root.right);
}

//SEARCH

private static boolean search(Node root, int key){
    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(root.data>key){
        return search(root.left, key);
    }else{
        return search(root.right, key);
    }
}

//DELETING A NODE
private static Node delete(Node root, int val){
    if(root.data<val){
        root.right = delete(root.right,val);
    }
    else if(root.data>val){
        root.left = delete(root.left,val);
    }else{//voila
        //case1
        if(root.left==null && root.right==null){
            return null;

        }

        //case 2: single child
        if(root.left==null){
            return root.right;
        }else if(root.right==null){    
            return root.left;
        }

        //case3 - both children
        Node IS =findInOrderSuccessor(root.right);
        root.data = IS.data;
        root.right =delete(root.right,IS.data);

    }
    return root;

}
private static Node findInOrderSuccessor(Node root){
    while(root.left!=null){
        root = root.left;
    }
    return root;
}

private static void printInRange(Node root, int k1, int k2){
    if(root==null){
        return;
    }
    if(root.data>=k1 && root.data<=k2){
        printInRange(root.left, k1, k2);
        System.out.print(root.data+" ");
        printInRange(root.right, k1, k2);
    }
    else if(root.data<k1){
        printInRange(root.left, k1, k2);;
    }else{
        printInRange(root.right, k1, k2);
    }
}

private static void printPath(ArrayList<Integer> path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+"->");

    }
    System.out.println("null");
}
public static void printRootToLeaves(Node root,ArrayList<Integer> path){
    if(root==null){
       return;
    }
    if(root.left==null && root.right==null){
        printPath(path);
    }
    path.add(root.data);
    printRootToLeaves(root.left, path);
    printRootToLeaves(root.right, path);
    path.remove(path.size()-1);
    
}

    public static void main(String[] args) {
     int values[] ={8,5,3,1,4,6,10,11,14};   
     Node root =null;
     for(int i=0;i<values.length;i++){
        root = insert(root, values[i]);
     }
     inOrder(root);

     //SEARCHING A NODE
     if(search(root, 5)){
        System.out.println("found");
     }else{
        System.out.println("not found");
     }

     root =delete(root,3);
     System.out.println();
     inOrder(root);
     
     printInRange(root, 5, 12);
     System.out.println();
System.out.println("root to leaves");
     printRootToLeaves(root, new ArrayList<>());
    }


}