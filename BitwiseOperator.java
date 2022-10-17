public class BitwiseOperator {
    public static void main(String[] args) {
       oddorEven(10);
       System.out.print("clear ith bit: ");
       System.out.println(getithbit(10,3));

       System.out.print("set ith bit: ");
       System.out.println(setithbit(10,2));
       
       System.out.print("clear ith bit: ");
       System.out.println(clearithBit(10, 1));
       
       System.out.print("update ith bit: ");
       System.out.println(updateithBit(10,1,0));  
       
       System.out.print("clear last i bits: ");
       System.out.println(clearlastbits(10,2));    
       
       System.out.print("clear range of i bits: ");
       System.out.println(clearRange(10,1,2));
       
       System.out.print("if a  number is power of two or not: ");
       System.out.println(isPowerOfTwo(8));
       
       System.out.print("number of set bits in a number: ");
       System.out.println(setbitscount(10));
      }
    private static void oddorEven(int n){
        int x =n&1;
        if(x==0){
            System.out.println("even number");

        }
        else{
            System.out.println("odd number");
        }
    }
    //get ith bit
    private static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
                }
        else{
            return 1;
        }
    }
    //set ith bit
    private static int setithbit(int n, int i){
        int bitmask =1<<i;
        return (n|bitmask);
    }

    //clear ith bit
    private static int clearithBit(int n, int i){
        int bitmask = ~(1<<i);
        return (n&bitmask);
    }
      //update ith bit
      private static int updateithBit(int n, int i, int newBit){
        // if(newBit==0){
        //     return clearithBit(n, i);
        // }else if(newBit==1){
        //     return setithbit(n, i);
        // }else{
        //     return -1;
        // }

        //OR

      int bitmask = newBit<<i;
      n=clearithBit(n, i);
      return (n|bitmask);
      }
      
      //clear last i bits
      private static int clearlastbits(int n, int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
      }
      //clear range 
      private static int clearRange(int n, int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
      }
      //to check if the number is power of two or not
      private static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0?true: false;
      }

      //counting number of setbits in a number
      private static int setbitscount(int n){
        int count =0;
        while(n>0){
          if((n&1)!=0){
            count++;
          }
          n=n>>1;
        }
        return count;
      }
}
