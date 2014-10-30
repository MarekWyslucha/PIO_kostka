package rzutkostka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import rzutkostka.Players.Player;

public class Game {
    
    //HumPlayer[] players = new HumPlayer[5];
    private Player player;
    private List<Player> players = new ArrayList<>();
    
    public void addPlayer(Player gracz){
        if(gracz != null){
            this.player = gracz;
            players.add(gracz);
        }
        else
            throw new IllegalArgumentException("NULL player is not permitted.");
    }
    
    void start(){
        Random rnd = new Random();
        
        int roll;
        int tr;
        boolean win = false;
        do{
            roll = rnd.nextInt(6)+1;
            
            for(Player p:players){
                System.out.println("Player: "+p.getName());
                tr = p.guess();
                System.out.println("Try: " + tr);
                System.out.println();
                
                if(roll == tr){
                    win = true;
                    break;
                }
            }
            System.out.println("Roll: " + roll);
            System.out.println();
       }while(!win);
    }
}
