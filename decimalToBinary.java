import java.util.Scanner;
public class decimalToBinary{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the decimal number you want to convert to binary ");
        int n= scan.nextInt();
        scan.close();
        System.out.println("value of decimal number "+ n +" in binary is " + toBinary(n));
    }
    public static int toBinary(int number){
        int decimalNumber =0;
        int i=0;
        while(number>0){

            int remainder = number%2;
            decimalNumber+=remainder*Math.pow(10, i);
            i++;
            number=number/2;

        }
        return decimalNumber;
    }
}