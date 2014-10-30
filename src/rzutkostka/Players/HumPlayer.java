package rzutkostka.Players;
import java.util.Scanner;

public class HumPlayer extends Player {
    Scanner write = new Scanner(System.in);
    
    public HumPlayer(){}
    
    public HumPlayer(String name){
        super(name);    //odwołanie się do pola klasy nadrzędnej
    }
    
    @Override
    public int guess(){
        int guess = 0;
        
        while(true){
            System.out.print("Guess: ");
            
            if(write.hasNextInt()){
                guess = write.nextInt();
                break;
            }
        }
        
        return guess;
    }
}
