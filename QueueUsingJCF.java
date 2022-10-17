import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        //OR
        // Queue<Integer> q= new ArrayDeque<>();
        //Queue is a not a class but an inteface and we can't make objects for intefaces so 
        //they can be made by the class that implements Queue ---LinkedList and ArrayDequeue
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
