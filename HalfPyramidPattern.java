import java.util.Scanner;
public class HalfPyramidPattern {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
for(int i=1;i<=number;i++){
   for(int j=number-1;j>=i;j--){
System.out.print(" ");
   }
   for(int j=1;j<=i;j++){
      System.out.print("*");
   }
   System.out.println();
   
}
scan.close();
}


}

