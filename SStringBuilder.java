
public class SStringBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        stringbuilderfunction(sb);
        //TO CONVERT FIRST LETTERS TO UPPERCASE OF A STRING
        String str="hello world";
        System.out.println(toupperCase(str));
        String newstr = "aaabbbcc";   
        System.out.println(compress(newstr));
        System.out.println(compress1(newstr));
    }

    private static String compress(String str){//--Do this with StringBuilde also
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();

            }
        }
        return newStr;

    }
    private static String compress1(String str){
        StringBuilder newStr = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count>1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }
    
    private static void stringbuilderfunction(StringBuilder sb){
       
        for(char ch='a';ch<='z';ch++){
           sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    //TO CONVERT FIRST LETTERS TO UPPERCASE OF A STRING
    private static String toupperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    
}