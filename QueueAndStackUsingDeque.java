import java.util.Deque;
import java.util.LinkedList;
public class QueueAndStackUsingDeque {
    static class stack{
        Deque<Integer> dq = new LinkedList<>();
        public void push(int data){
            dq.addLast(data);
        }
        public int pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }

    static class queue{
        Deque<Integer> dq = new LinkedList<>();
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        System.out.println("Stack----------");
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek "+ s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop()); 

        System.out.println("Queue-----------");
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove()); 
        

    }
}
