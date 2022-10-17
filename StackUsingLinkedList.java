public class StackUsingLinkedList {
    //Stack class
    class Stack{

        //Node class
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next =null;
            }
        }
    static Node head =null;
    //isEmpty
    public static boolean isEmpty(){
        return head==null;
    }

    //pushing data to the Stack
    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
    
        newNode.next=head;
        head = newNode;
        return;
    }
    //removing top element from Stack i.e pop
    public static int pop(){
        if(isEmpty()){
            return-1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    //seeing the first element--pop
    public static int peek(){
        return head.data;
    }
     
    }
    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        
        while(!Stack.isEmpty()){
           
            System.out.println(Stack.peek());
            Stack.pop();
            
        }
    }
}



