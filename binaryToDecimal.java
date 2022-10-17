import java.util.*;
public class binaryToDecimal {
    private static void BinarytoDecimal(int number){
        float DecimalNumber =0;
        int i=0;
        while(number!=0){
            int lastDigit = number%10;
            DecimalNumber+=(lastDigit*Math.pow(2, i));
            number  = number/10;
            i++;
        }

        System.out.println(DecimalNumber);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
     BinarytoDecimal(number);
     scan.close();

    }
}

