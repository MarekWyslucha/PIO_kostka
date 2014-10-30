package rzutkostka;

import java.util.Random;
import rzutkostka.Players.Player;

public class Game {
    
    //HumPlayer[] players = new HumPlayer[5];
    Player player = new Player();
    
    void addPlayer(Player gracz)
    {
        player = gracz;
    }
    
    void start()
    {
        Random rnd = new Random();
        
        int roll;
        int tr;
        
        do{
           roll = rnd.nextInt(6)+1;
           //tr[0] = cpl01.guess();
           System.out.println("Player: "+player.getName());
           tr = player.guess();
           
           //System.out.println("Player: "+cpl01.getName());
           System.out.println("Try: " + tr);
           System.out.println("Roll: " + roll);
           System.out.println();
       }while(roll != tr);
    }
}
