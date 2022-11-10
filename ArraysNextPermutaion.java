public class ArraysNextPermutaion {
    private static void nextPermutation(int arr[]){
        if(arr==null || arr.length<=1){
            return;
        }
        int i=arr.length-2;
        while(i>=0 && arr[i]>arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }

        reverse(arr,i+1,arr.length-1);
        
    }

    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void reverse(int arr[],int i,int j){
        while(i<j) swap(arr, i++, j--);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,4,2};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
