public class RBinaryStringProblem {
    public static void main(String[] args) {
        binaryString(3, 0, "");
    }
    //print all binary String of size n without consecutive 1's
    private static void binaryString(int n, int lastIndex, String str ){
        //base
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastIndex==0){
        //     binaryString(n-1,0,str.append("0"));
        //     binaryString(n-1,1,str.append("1"));

        // }else{
        //      binaryString(n-1,0,str.append("0"));
        // }

        binaryString(n-1, 0, str+"0");
        if(lastIndex==0){
            binaryString(n-1, 1, str+"1");
        }
    }
    
}
