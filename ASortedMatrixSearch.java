public class ASortedMatrixSearch {
    public static void main(String[] args) {
        int key=33;
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        stairCaseSearch(matrix,key);
      
    }
    private static boolean stairCaseSearch(int matrix[][],int key){//time complexity--O(row+col)--here(i+j)
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length &&j>=0){
            if(matrix[i][j]==key){
                System.out.println("key is found at: ("+i+","+j+")");
                return true;
            }else if(key<matrix[i][j]){
                j--;
            }else if(key>matrix[i][j]){
                i++;
            }
        }
        System.out.println("key not found");
        return false;

    }
}
