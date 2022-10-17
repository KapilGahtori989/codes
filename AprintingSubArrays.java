public class AprintingSubArrays {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};

        subArrays(numbers);
    }
    private static void subArrays(int numbers[]){
        int ts=0;
        int minimum = Integer.MAX_VALUE;
        int maximum =Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start =i;
        for(int j=i+1;j<numbers.length;j++){
            int end =j;
            int total =0;
           
            for(int x =start;x<=end;x++){
                System.out.print(numbers[x]+" ");
                total += numbers[x];
            }
            System.out.print("--"+total);
            ts++;
            if(total<minimum){
                minimum =total;
            }else if(total>maximum){
                maximum=total;
            }
            System.out.println();
        }
        System.out.println();

        }
        System.out.println("total number of subArrays are: "+ ts);
        System.out.println("maximum sum possible is :  "+ maximum);
        System.out.println("minimum sum posssible is: "+minimum);
    }
}
