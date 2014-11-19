package rzutkostka;

import java.util.ArrayList;
import java.util.Iterator;
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
            
            String name;
            int i=0;
            
            name=this.player.getName();
            for(Player pl:players){
                if(pl.getName().equals(name)){
                    i++;
                    pl.setName(name+"_"+i);
                }
            }
            
            players.add(gracz);
        }
        else
            throw new IllegalArgumentException("NULL player is not permitted.");
    }
        
    public void removePlayer(String name){
        Iterator list = players.iterator();
        
        while(list.hasNext()){
            Player pl = (Player) list.next();
            if(pl.getName().equals(name)){
                list.remove();
            }
            
        }
    }
    
    void start(){
        Random rnd = new Random();
        
        int roll;
        int tr;
        int l=1;
        boolean win = false;
        do{
            roll = rnd.nextInt(6)+1;
            
            System.out.print("---------RUNDA "+l+"----------------------------");
            l++;
            
            for(Player p:players){
               System.out.println("Player: "+p.getName());
               tr = p.guess();
               System.out.println("Try: " + tr);    // wypisuje wybraną przez gracza liczbę
                
               if(roll==tr){
                   System.out.println("HIT!");
                   win=true;
               }else
                   System.out.println("MISS");
                
               System.out.println();
            }
            System.out.println("Roll: " + roll);    // wypisuje wylosowaną liczbę
            System.out.println();
       }while(!win);
    }
}
