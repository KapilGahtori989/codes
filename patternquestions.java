import java.util.Scanner;
public class patternquestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        scan.close();


        System.out.println("This is reverse half pyramid pattern");
        reverseHalfPyramid(n);
        System.out.println();
        System.out.println();


        System.out.println("this is inverted half pyramid pattern");
        invertedHalfPyramid(n);
        System.out.println();
        System.out.println();


        System.out.println("This is floyds Triangle");
        floydsTriangle(n);
        System.out.println();
        System.out.println();


        System.out.println("this is a zero on triangle");
        ZeroOneTriangle(n);
        System.out.println();
        System.out.println();


        System.out.println("this is a butterfly pattern");
        butterflyPattern(n);
        System.out.println();
        System.out.println();


        System.out.println("this is a solid rhombus pattern");
        solidRhombusPattern(n);
        System.out.println();
        System.out.println();


        System.out.println("this is a hollow rhombus pattern");
        hollowRhombusPattern(n);
        System.out.println();
        System.out.println();


        System.out.println("this is  a diamnond patternd");
        diamondPattern(n);
        System.out.println();
        System.out.println();


        System.out.println("this is a number pyramid pattern"); 
        numberPyramidPattern(n);
        System.out.println();
        System.out.println();


        System.out.println("this is a pallindrome pyramid pattern");
        pallindromicNumberPyramidPattern(n);
        System.out.println();
        System.out.println();

        System.out.println("printed pallindrome pyramid in a better way");
        pallindromicPyramidAlternative(n);
    }

    //INVERTED AND ROTATED HALF-PYRAMID
    private static void reverseHalfPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){

                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //INVERTED HALF-PYRAMID
   private static void invertedHalfPyramid(int n){
    for(int i=n;i>=0;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
   }
   //FLOYD'S TRIANGLE PATTERN

   private static void floydsTriangle(int n){
    int x =1;
    for(int i=0;i<n;i++){
        
        for(int j=0;j<=i;j++){
            System.out.print(x+ " ");
            x++;
        }
        System.out.println();
    }
   }

   //0-1 Triangle

   private static void ZeroOneTriangle(int n){
    int x=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(x+ " ");
            x = (x==1)? 0:1;
        }
        System.out.println();
    }
    

   }
   //BUTTERFLY PATTERN
   private static void butterflyPattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        for(int j=n-i-1;j>0;j--){
            System.out.print(" ");
        }
        for(int j=n-i-1;j>0;j--){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
    }
    for(int i=n-2;i>=0;i--){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        for(int j=n-i-1;j>0;j--){
            System.out.print(" ");
        }
        for(int j=n-i-1;j>0;j--){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
    }
   }
   
   //RHOMBUS PATTERN
   private static void solidRhombusPattern(int n){
   for(int i=0;i<n;i++){
    for(int j=n-i;j>0;j--){
        System.out.print(" ");
    }
    for(int j=0;j<n;j++){
        System.out.print("*");
    }
    System.out.println();
   }
}

//HOLLOW RHOMBUS PATTERN
private static void hollowRhombusPattern(int n){
    for(int i=0;i<n;i++){
        for(int j=n-i;j>0;j--){
            System.out.print(" ");
        }
        for(int j=0;j<n;j++){
            if(j==0 || j==n-1 || i==0 || i==n-1){
                System.out.print("*");
            }
            else{
            System.out.print(" ");
            }
        }
        System.out.println();
       }
}
//DIAMNOND PATTERN

private static void diamondPattern(int n){
    for(int i=0;i<n;i++){
        for(int j=n-i-1;j>0;j--){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        for(int j=1;j<i;j++){
            System.out.print("*");
        }
      
        System.out.println();
    }

    for(int i=n-2;i>0;i--){
        for(int j=n-i-1;j>0;j--){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        for(int j=1;j<i;j++){
            System.out.print("*");
        }
      
        System.out.println();
    }
}
//NUMBER PYRAMID PATTERN
private static void numberPyramidPattern(int n){
   
    for(int i=1;i<=n;i++){
        for(int j=n-i;j>0;j--){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        for(int j=1;j<i;j++){
            System.out.print(i+ " ");
        }
      
        System.out.println();
    }
}
//PALINDROMIC PATTERN WITH NUMBERS
private static void pallindromicNumberPyramidPattern(int n){
   
    for(int i=1;i<=n;i++){
        for(int j=n-i;j>0;j--){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            int x=i-j+2;
            x--;
            System.out.print(x+" ");
        }
        for(int j=1;j<i;j++){
            int x=j;
            x++;
            System.out.print(x+ " ");
        }
      
        System.out.println();
    }
}
//BETTER WAY BY SHRADHA MAM
private static void pallindromicPyramidAlternative(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}