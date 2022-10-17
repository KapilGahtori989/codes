//to find a particular target in rotated and sorted array:

public class SearchDivideandConquer{
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target =6;
        int idx = search(arr, target, 0, arr.length-1);
        System.out.println(idx);
    }
    private static int search(int arr[], int target , int si,int ei ){//---time complexity O(nlog(n))
        int mid=si+(ei-si)/2;

        if(arr[mid]==target){return mid;}

        //which line
        //L1
        if(arr[si]<=arr[mid]){
            //left
            if(target<=arr[mid] && arr[si]<=target){
                return search(arr, target, si, mid);
            }
            //right
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        //L2
        else{
            //right
            if(target>=arr[mid] && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                return search(arr, target, si, mid-1);
            }
        }
    }
}