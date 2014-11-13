package rzutkostka;
import rzutkostka.Players.ComPlayer;
import rzutkostka.Players.HumPlayer;

public class RzutKostka {
    
    public static void main(String[] args) {

        ComPlayer cpl01 = new ComPlayer();
        ComPlayer cpl02 = new ComPlayer();
        HumPlayer hpl01 = new HumPlayer("Human Player");
        HumPlayer hpl02 = new HumPlayer("Human Player");

        Game game = new Game();
        game.addPlayer(hpl01);
        game.addPlayer(hpl02);
        game.addPlayer(cpl01);
        game.addPlayer(cpl02);
        
        game.start();

    }
}
