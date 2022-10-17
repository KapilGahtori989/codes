import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.println("enter number of rows ");
   int rows=scan.nextInt();
   System.out.println("enter number of columns ");
   int columns =scan.nextInt();
   for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
        if(j==0 || j==columns-1 || i==0 || i==rows-1){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
  }
  scan.close();


    
}
}
