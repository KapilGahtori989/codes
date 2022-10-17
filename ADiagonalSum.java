public class ADiagonalSum {
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(DiagonalSum(matrix));//O(n^2)--time complexity
        System.out.println(optimisedDiagonalSum(matrix));//O(n)--time complexity
    }
  
    //BRUTE FORCE
    private static int DiagonalSum(int matrix[][]){ //O(n^2)--time complexity
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }else if(i+j ==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    private static int optimisedDiagonalSum(int matrix[][]){//O(n)--time complexity
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //for primary diagonal
            sum+=matrix[i][i];
            //for secondary diagnol
            if(i!=matrix.length-1-i){//i+j=n-1---where n is matrix.length
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
}
