public class LLDouble {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }
    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev =newNode;
        head = newNode;

    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(head ==null){
            System.out.println("linked list is empty");
        return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    //To print a linked list in reverse
    // public void reverse(){
    //     for(int i=size-1;i>=0;i--){
    //         System.out.print(tail.data+"->");
    //         tail = tail.prev;
    //     }
    //     System.out.println("null");
    // }

    //To actually reverse a linkedList
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next =curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        LLDouble ll = new LLDouble();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();
        System.out.println(size);
        System.out.println("data removed is:"+ll.removeFirst());
        ll.print();
        ll.reverse();
        ll.print();
    }
}
