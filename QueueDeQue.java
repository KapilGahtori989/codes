import java.util.*;

public class QueueDeQue {
    
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        System.out.println(q);
        q.removeFirst();
        q.addLast(3);//1 3
        q.addLast(4);// 1 3 4
        q.removeLast(); //1 3
        System.out.println(q);
        System.out.println("first el "+q.getFirst());
        System.out.println("last el "+q.getLast());

    }
}
