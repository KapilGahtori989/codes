import java.util.Scanner;
public class maxofthree{
    public static void main(String[] args) {

        int a,b,c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        scan.close();
        int max;
        max = maxOfThree(a,b,c);
        System.out.println(max);

    }
    private static int maxOfThree(int a, int b, int c){
        if(a>b && a>c){
        return a;
        }else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }


}