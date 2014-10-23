package rzutkostka.Players;
import java.util.Random;

public class ComPlayer extends Player {
    
    int gs;
    
    public ComPlayer(){}
    
    public ComPlayer(String name)
    {
        super(name);    //odwołanie się do pola klasy nadrzędnej
    }
    
    @Override
    public int guess()
    {
        Random rnd = new Random();
        gs = rnd.nextInt(6)+1;
        return gs;
    }
}
