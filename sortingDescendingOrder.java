import java.util.Arrays;
import java.util.Collections;

public class sortingDescendingOrder{
public static void main(String[] args) {
    int nums[]={3,6,2,1,8,7,4,5,3,1};
    bubbleSort(nums);
    SelectionSort(nums);
    insertionSort(nums);
    System.out.println("through counting sort: ");
    countingSort(nums);
    System.out.println("through inbuilt sorting: ");
    inbuilt(nums);
}
private static void bubbleSort(int nums[]){
    for(int i=0;i<nums.length-1;i++){
      for(int j=0;j<nums.length-1-i;j++){
        if(nums[j]<nums[j+1]){
            int temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
        }
      }
        }
        printArray(nums);
    }

    private static void SelectionSort(int nums[]){
        for(int i=0;i<nums.length;i++){
            int maxPos=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[maxPos]<nums[j]){
                    maxPos=j;
                }
                int temp=nums[i];
                nums[i]=nums[maxPos];
                nums[maxPos]=temp;
            }
        }
        printArray(nums);
    } 

    private static void insertionSort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;
            while(prev>=0 && nums[prev]<curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;
        }
        printArray(nums);
    }


private static void printArray(int nums[]){
    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
    }
    System.out.println();
}

private static void countingSort(int nums[]){
    //find largest number
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>largest){
            largest=nums[i];
        }
    }

    int count[]= new int[largest+1];

    for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
    }

    for(int i=count.length-1;i>=0;i--){
        int j=0;
        while(count[i]>0){
            count[j]=i;
            j++;
            count[i]--;
        }
    }

    printArray(nums);
}

private static void inbuilt(int nums[]){
    //making an Integer type array and putting all values of nums in it i.e converting int nums to Integer type for using 
    //Collections
    Integer arr[] = new Integer[nums.length];
    for(int i=0;i<nums.length;i++){
        arr[i]=nums[i];
    }
    Arrays.sort(arr,Collections.reverseOrder());
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
