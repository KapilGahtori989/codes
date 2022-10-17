//imported for using inbuilt sorting functions in java
import java.util.Arrays;
import java.util.Collections;

public class sortingBasic{
    public static void main(String[] args)
     {
        int nums[]  = {4,5,2,3,2};
        selectionSort(nums);
        System.out.println();
        System.out.println("my check");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        bubblesort(nums);
        System.out.println();
        insertionSort(nums);
        System.out.println();
          inbuilt(nums);
          System.out.println();
          System.out.println("Through counting sort");
          countingSort(nums);

    }
    //BUBBLE SORT
    private static void bubblesort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp =numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        printArray(numbers);
    }

    //SELECTION SORT
    private static void selectionSort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            int minPos =i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[minPos]>numbers[j])
                {
                    minPos =j;
                }
            }
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
        printArray(numbers);
    }
    private static void printArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }

    //INSERTION SORT
    private static void insertionSort(int numbers[]){
        for(int i=1;i<numbers.length;i++){
            int curr =numbers[i];
            int prev=i-1;
            //finding correct position to insert
            while(prev>=0 && numbers[prev]>curr){
                numbers[prev+1]=numbers[prev];
                prev--;
            }
            //inserting element
            numbers[prev+1]=curr;
        }
        printArray(numbers);
    }
    //INBUILT FUNCTIONS FOR SORTING
    private static void inbuilt(int numbers[]){
        System.out.println("through inbuilt sorting: ");
        //import import java.util.Arrays;
        Arrays.sort(numbers);
        printArray(numbers);
        System.out.println();
        //for reverseSorting
        Integer arr[] ={1,2,3,4,5};
        //import import java.util.Collections;
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    //COUNTING SORT
    private static void countingSort(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            largest = Math.max(largest, numbers[i]);
        }
        int count[] = new int[largest +1];
        for(int i=0;i<numbers.length;i++){
            count[numbers[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                numbers[j]=i;
                j++;
                count[i]--;
            }
        }

        printArray(numbers);
    }

}