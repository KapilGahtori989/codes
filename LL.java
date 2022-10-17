
public class LL{
  public static Node head;
  public static Node tail;
  public static int size;
  
  public void addFirst(int data){
   
    Node newNode = new Node(data);
    size++;
    if(head ==null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head=newNode;
  }

  public void addLast(int data){
    size++;
    Node newNode = new Node(data);
    if(head ==null){
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void removeFirst(){
    if(size==0){
      System.out.println("Linked List is empty");
      return;
    }
    if(size==1){
      size=0;
      head = tail = null;
      return;
    }
    head = head.next;
    
  }

  public void removeLast(){
    if(size==0){
      System.out.println("Linked List is empty");
      return;
    }
    if(size==1){
      size=0;
      head = tail = null;
      return;
    }
    Node temp = head;
    for(int i=1;i<size-1;i++){
      temp = temp.next;
    }
    temp.next =null;
    tail = temp;
    size--;
  }
  
  public void reverseLL(){
    Node prev = null;
    Node curr =tail  = head;
    Node future;
    while(curr!=null){
      future = curr.next;
     curr.next = prev;
     prev = curr;
     curr = future;
    }
    head = prev;
  }
  //recursive approach
  public int helper(Node head,int key){
    if(head==null){
      return -1;
    }
    if(head.data ==key){
      return 0;
    }
    int idx =helper(head.next,key);
    if(idx==-1){
      return -1;
    }
    return idx+1;
  }
  public int recursiveSearch(int key){
    return helper(head,key);
  }

  public void search(int n){
    Node temp = head;
    int i=0;
    while(temp!=null){   
      if(temp.data == n){
        System.out.println("data is present in index "+i);
        return;
      }
      temp = temp.next;
      i++;
    }
    System.out.println("element not found");
  }
  public void print(){
    
    if(size==0){
      System.out.println("Linkeed List is empty");
    }
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void removeNthFromLast(int idx){
    if(idx<=0){
      System.out.println("no element exists in this index");
    return;
    }
    Node temp = head;
    int sz =0;
    while(temp!=null){
      sz++;
      temp = temp.next;
    }
    if(idx ==size){
      head = head.next;
      return;
    }

    int x = sz-idx;//index from starting that needs to be removed
    Node n = head;
   
    for(int i=0;i<x-1;i++){
      n =n.next;
    }
    Node curr = n.next;
    n.next  = curr.next;
  }
  public Node findMiddle(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
      slow = slow.next;//+1
      fast = fast.next.next;//+2
    }
    return slow;
  }
  public boolean checkPalindrome(){
    if(head ==null || head.next==null){
      return true;
    }

    Node mid = findMiddle(head);
    Node prev=null;
    Node curr =mid;
    Node next;
    while(curr!=null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    } 
    Node right  = prev;
    Node left = head;

    while(right!=null){
      if(left.data!=right.data){
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
   

  }
public boolean checkCycle(){
  Node slow = head;
  Node fast = head;
  while(fast!=null && fast.next!=null){
    slow = slow.next;
    fast = fast.next.next;
    if(slow==fast){
      return true;
    }
  }
  return false;
}

public void removeCycle(){
  //detect cycle

  Node slow = head;
  Node fast = head;
  boolean cycle = false;

 
  while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
      if(fast == slow){
          cycle = true;
          break;
      }
    }
      if(cycle==false){
          return;
      }
      //meeting point
      slow = head;
      if(tail.next == head){
        tail.next = null;
        return;
      }
      Node prev = null;
      while(slow!=fast){
          prev = fast;
          slow = slow.next;
          fast = fast.next;
      }


      //remove cycle
      prev.next =null;
   }
  

//----------------------------------------------
  public static void main(String[] args) {
 LL p = new LL();
 p.addFirst(1);
 p.addLast(2);
 p.addLast(3);
 tail.next = head;
 System.out.println(p.checkCycle());
 p.removeCycle();
 System.out.println(p.checkCycle());
 p.print();
 

 //just to remove errors--------
 p.checkPalindrome();
 p.recursiveSearch(2);
 p.search(2);
//--------------------------------
  }
}
//-----------------------------------------------
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}