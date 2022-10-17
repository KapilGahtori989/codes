import java.util.Stack;
public class StackReverseAString {
    public static String reverse(String s){
        Stack<Character> ss = new Stack<>();
        int idx =0;
        while(idx<s.length()){
            ss.push(s.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!ss.isEmpty()){
            result.append(ss.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverse(str));
    }
}
