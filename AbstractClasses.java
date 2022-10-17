public class AbstractClasses {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

        // Animal a = new Animal();-----> can't create object of abstract classes
    }
    
}
abstract class Animal{
    String color;
    Animal(){
        color = "peach";
    }
    void eat(){
        System.out.println("eats anything");
    }
    abstract void walk();//is not defined within the same class, it's just created

}
class Horse extends Animal{
    void changeColor(){
        color="dark brown";
    }
    @Override
    void walk() {
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal{
    //color of chicken will remain that of Animal because parent constructor is called before the child constructor
    @Override
    void walk() {
        System.out.println("walks on two legs");
    }
}
