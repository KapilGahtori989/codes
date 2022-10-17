
public class AarraysSearch{
    public static void main(String[] args) {
   
        int numbers[] = {2,4,6,8,10,12,14};
        printLargest(numbers);

        //FOR BINARY SEARCH
        int key =10;
        int index= binarySearch(numbers, key);

        if(index>0){
            System.out.println("key is present at index: "+index);
        }else{
            System.out.println("key is not present in the given array");
        }

        System.out.println("reverse of array is : ");
        reverseArray(numbers);
    }

    //PRINTING LARGEST NUMBER IN AN ARRAY
    private static void printLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest number is "+largest);

    }

    //BINARY SEARCH

    private static int binarySearch(int numbers[],int key){

        int start =0;
        int end = numbers.length-1;
       
        while(start<=end){
            int mid= (start +end)/2;
            if(numbers[mid]==key){
               return mid;
            }else if(numbers[mid]>key){
                end =mid-1;
            }else{
                start =mid+1;
            }
            
        }
        return -1;
        
    }

    private static void reverseArray(int numbers[]){

        int mid = (numbers.length-1)/2;
        for(int i=0;i<=mid;i++){
          
            int temp;
           temp =numbers[i];
           numbers[i]=numbers[numbers.length-i-1];
           numbers[numbers.length-i-1]=temp;
            
        }
        
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        
       
    }
}