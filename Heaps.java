import java.util.ArrayList;
public class Heaps {
    static class Heap{
        static ArrayList<Integer> arr = new ArrayList<>();

        private static void add(int data){
            //add at last index;
            arr.add(data);
            int x = arr.size()-1;//child index
            int par = (x-1)/2;

            while(arr.get(x)<arr.get(par)){//log(n)--because we can compare only till height of heap i.e log(n)
              //swap
              
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                //resetting index of parent and child
                x = par;
                par = (x-1)/2;
            }
        }

        //to get min node in heap

        // private static int minInHeap(){
        //     return arr.get(0);
        // }

        private static void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;
            if(left<arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx =right;
            }

            if(minIdx!=i){
                //swap

                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);

            }
        }
        private static int remove(){
            int data = arr.get(0);

            //step1- swap first and last

            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step2 - delete last

            arr.remove(arr.size()-1);

            //step3 - heapify
            heapify(0);
            return data;
        }

        private static boolean isEmpty(){
            return Heap.arr.size()==0;
        }
        private static int peek(){
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        Heap.add(2);
        Heap.add(3);
        Heap.add(4);
        Heap.add(5);
        Heap.add(10);
        Heap.add(1);

        while(!Heap.isEmpty()){
            System.out.println(Heap.peek());
            Heap.remove();
        }

        // System.out.println(Heap.arr);
        // System.out.println("min in heap = "+Heap.minInHeap());

        // System.out.println(Heap.remove());
        // System.out.println(Heap.arr);
    }
}
