public class Scomparision {
    public static void main(String[] args) {
        //here we will do lexicographic approach
        String fruits[]={"apple","mango","banana"};
        compare(fruits);
    }
    private static void compare(String fruits[]){
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);

    }
    
}
