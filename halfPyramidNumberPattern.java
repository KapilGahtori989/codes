import java.util.Scanner;
public class halfPyramidNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        char c = 'A';
        for(int i=0;i<=number;i++){

            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++; 
            }
            System.out.println();
        }
        scan.close();
    }
}
