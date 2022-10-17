import java.util.Scanner;

public class gettingPrimeNumbersInRange{
    static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
int number =scan.nextInt();
primeNumbers(number);
scan.close();
}
private static void primeNumbers(int n){
    for(int i=2;i<=n;i++){
        if(isprime(i)){
            //true
            System.out.print(i+ " ");
        }
    }
}
}