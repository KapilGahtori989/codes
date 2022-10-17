import java.util.Stack;
public class StackReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3 2 1
        reverseStack(s);
        printStack(s);
        //1 2 3
    }
    private static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
           return;
        }
        int temp = s.pop();
        reverseStack(s);
        pushAtBottom(temp,s);
    }
    private static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBottom(data, s);
        s.push(temp);
       
      }
      private static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
      }
}
