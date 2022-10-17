import java.util.Stack;
public class StacksAreaInHistogram {//time complexity--O(n)
  public static void maxArea(int arr[]){
    int maxArea=0;
    int nsr[]= new int[arr.length];
    int nsl[]= new int[arr.length];

    //NextSmallerRight
    Stack<Integer> s = new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            //-1
           nsr[i]=arr.length;
        }else{
            //top
            nsr[i]=s.peek();
        }
        s.push(i);
    }
    //NextSmallerLeft
    s= new Stack<>();
    for(int i=0;i<arr.length;i++){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            //-1
           nsl[i]=-1;
        }else{
            //top
            nsl[i]=s.peek();//here only index because we do not want height but only index
        }
        s.push(i);
    }

    //Current area
    for(int i=0;i<arr.length;i++){
        int height =arr[i];
        int width= nsr[i]-nsl[i]-1;
        int currArea= height*width;
        maxArea = Math.max(currArea,maxArea);
    }
    System.out.println("max area in histogram is "+ maxArea);
  }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};//heights in histogram
        maxArea(arr);

    }
}
