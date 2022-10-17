import java.util.Stack;
public class StackPushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        StackPushAtBottom a = new StackPushAtBottom();
        a.pushAtBottom(4, s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

      //PUSH AT BOTTOM OF STACK
      private void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBottom(data, s);
        s.push(temp);
       
      }

}
