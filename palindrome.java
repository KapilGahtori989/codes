import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter a palindromic number ");
int n= scan.nextInt();
isPalindrome(n);
scan.close();
    }
    private static void isPalindrome(int n){
        if(reverse(n)==n && reverse(n)>0){
            System.out.println("this number is a palindrome number ");
        }else{
            System.out.println("this number is not a palindrome ");
        }
    }
   private static int reverse(int n){
    int reverseNumber=0;
    while(n!=0){
        int lastDigit = n%10;
        reverseNumber = reverseNumber*10 +lastDigit;
        n = n/10;
    }
    return reverseNumber;

   }

}
