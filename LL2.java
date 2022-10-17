
public class LL2 extends LL {
    public static void main(String[] args) {
        //create
       LL2 ll = new LL2();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addFirst(4);
       ll.addFirst(5);
       ll.print();
       head = ll.mergeSort(head);
       ll.print();
       System.out.println("zig Zag");
       ll.zigZag();
       ll.print();

        
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast =head.next;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow; //mid node
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null ){
            return head;
        }
        //find mid
        Node mid  = findMid(head);
        //left & right Ms
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);
        mergeSort(head);
        //merge
        return merge(newLeft,newRight);
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2= head2.next;
                temp  = temp.next;
            }
        }

        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while(head2!=null){
            temp.next = head2;
            head2= head2.next;
            temp  = temp.next;
        }
        return mergedLL.next;
    }
    private void zigZag(){
        //find mid
        Node mid = findMid(head);
        //2nd half reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev =null;
        Node next;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        
        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        //alt-zigZag
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR= right.next;
            right.next= nextL;

            //update;
            right = nextR;
            left = nextL;
        }


    }
}
 