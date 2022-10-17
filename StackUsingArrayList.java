import java.util.ArrayList;
public class StackUsingArrayList {

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
class Stack{
static ArrayList<Integer> list = new ArrayList<>();

static boolean isEmpty(){
    return list.size()==0;
}
static void push(int data){
    list.add(data);
}

static int pop(){
    if(list.size()==0){
        return -1;
    }
    int top = list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;
}

static int peek(){
    if(isEmpty()){
        return -1;
    }
    return list.get(list.size()-1);
}
}
