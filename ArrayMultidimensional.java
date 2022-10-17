import java.util.Scanner;
public class ArrayMultidimensional{
    public static void main(String[] args) {
        int arr[][]= new int[3][3];
        multiDimensionsalArray(arr);
        // SEARCHING FOR A KEY IN THAT PARTICULAT ARRAY
        search(arr,12);
       
       
    }
    private static void multiDimensionsalArray(int arr[][]){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        //printing array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }        
        scan.close();
    }
    //SEARCHING ELEMENT IN MULTIDIMENSIONAL ARRAY
    private static boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("key is found");
                    return true;
                }
            }
        }
        return false;
    }
}