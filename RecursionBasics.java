public class RecursionBasics{
    public static void main(String[] args) {
        printDec(10);
        System.out.println();
        printInc(10);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sum(5));
        //fibonacci sequence--through brute force time complexity(O(2^n))
       System.out.println(fib(5));
       int nums[]={1,2,3,5,4,3};
       //if sorted or not
       System.out.println(sorted(nums, 0));
       //firstOccurence  
       System.out.println(firstOcc(nums,0,3));
       //lastOccurence
       System.out.println(lastOcc(nums,nums.length-1,3)); 
       //power of x
       System.out.println(power(2,10));
       //optimized power of x
       System.out.println(optimizedPower(2,10));
    }

    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    private static int factorial(int n){// time complexity = O(n) && space complexity = O(n)
        if(n==0){
            return 1;
        }
        int f = n*factorial((n-1));
        return f;
    }

    private static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum = n+sum(n-1);
        return sum;
    }

    private static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1= fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    private static boolean sorted(int nums[], int i){
        if(i==nums.length-1){
            return true;
        }
        if(nums[i]>nums[i+1]){
            return false;
        }
        return sorted(nums,i+1);
    }

    private static int firstOcc(int nums[], int i, int key){
        if(i==nums.length-1){
            return -1;
        }
        if(nums[i]==key){
            return i;
        }
        return firstOcc(nums, i+1, key);
    }

    private static int lastOcc(int nums[], int i, int key){
        if(i<0){
            return -1;
        }
        if(nums[i]==key){
            return i;
        }
        return lastOcc(nums, i-1, key);
    }

    private static int power(int n, int i)
{
    if(i==1){
        return n;
    }
    // int xnm1 = power(n, i-1);
    // int x =x*xnm1;
    // return x;
    //or
    
    return n*power(n, i-1);
}

private static int optimizedPower(int n, int i){
    if(i==0){
        return 1;
    }
    // int halfPowersq = optimizedPower(n, i/2) * optimizedPower(n, i/2);-- if we will do this then function will be called 
    //                                                                      two times which will increase time complexity to
   //                                                                       O(n) again 
   int halfPower = optimizedPower(n, i/2);// so we will store value of square in a variable and call that variable twice
   int halfPowersq = halfPower*halfPower;
    if(i%2!=0){
        halfPowersq =  n*halfPowersq;
    }
    return halfPowersq;
    //if your program gives 0 for higher power its because int can't hold large values to do that convert all int to double
}
}
