package rzutkostka;
import java.util.Random;
import rzutkostka.Players.ComPlayer;
import rzutkostka.Players.HumPlayer;

public class RzutKostka {
    
    public static void main(String[] args) {
       Random rnd = new Random();
       
       int roll;
       int[] tr = new int[5];
       
       ComPlayer cpl01 = new ComPlayer();
       HumPlayer hpl01 = new HumPlayer("Human Player");
      
       try{
            hpl01.setName(null);
       }
       catch(IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
       
       do{
           roll = rnd.nextInt(6)+1;
           tr[0] = cpl01.guess();
           System.out.println("Player: "+hpl01.getName());
           tr[1] = hpl01.guess();
           
           System.out.println("Player: "+cpl01.getName());
           System.out.println("Try: " + tr[0]);
           System.out.println("Roll: " + roll);
           System.out.println();
       }while((roll != tr[0]) && ((roll != tr[1])));
    }
}
