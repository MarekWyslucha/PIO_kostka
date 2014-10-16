package rzutkostka;
import java.util.Random;

public class ComPlayer extends Player {
    
    int gs;
    
    @Override
    public int guess()
    {
        Random rnd = new Random();
        gs = rnd.nextInt(6)+1;
        return gs;
    }
}
