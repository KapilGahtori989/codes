public class SsubString {
    public static void main(String[] args) {
        String str="HelloWorld";
        int start = 0;
        int end=3;
        subString(str,start,end);
    }
    private static void subString(String str,int start,int end){
        String string = "";
        for(int i=start;i<=end;i++){
            string+=str.charAt(i);
        }
        System.out.print(string);
    }
    
}
