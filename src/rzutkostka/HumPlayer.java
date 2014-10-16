package rzutkostka;
import java.util.Scanner;

public class HumPlayer extends Player {
    Scanner write = new Scanner(System.in);
    
    @Override
    public int guess()
    {
        int guess = 0;
        
        while(true)
        {
            System.out.print("Guess: ");
            if(write.hasNextInt())
            {
                guess = write.nextInt();
                break;
            }
        }
        
        System.out.println();
        return guess;
    }
}
