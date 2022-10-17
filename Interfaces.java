public class Interfaces {
 public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();

    Bear b = new Bear();
    b.eatsgrass();
    b.eatsmeat();
 }   
}
interface ChessPlayer{
 void moves();
}
class Queen implements ChessPlayer{
@Override
public void moves() { //if we will not put public in th function or method then it will become defualt which is diff from public in interface 
    System.out.println("up, down , left, right , diagnol");
}
}

interface herbivores{
void eatsgrass();
}
interface carnivore{
    void eatsmeat();
}

class Bear implements herbivores, carnivore{
@Override
public void eatsgrass() {
    System.out.println("eats all kind of grasses");
}

@Override
public void eatsmeat() {
    System.out.println("eats meat");
    
}

}
