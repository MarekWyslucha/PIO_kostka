package rzutkostka;
import java.util.Random;
import rzutkostka.Players.ComPlayer;
import rzutkostka.Players.HumPlayer;

public class RzutKostka {
    
    public static void main(String[] args) {

        ComPlayer cpl01 = new ComPlayer();
        HumPlayer hpl01 = new HumPlayer("Human Player");

        Game game = new Game();
        game.addPlayer(hpl01);
        
        
    }
}
