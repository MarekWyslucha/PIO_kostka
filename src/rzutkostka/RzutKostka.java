package rzutkostka;
import java.util.Random;

public class RzutKostka {
    
    public static void main(String[] args) {
       Random rnd = new Random();
       
       int roll = 0;
       int[] tr = new int[5];
       
       ComPlayer pl01 = new ComPlayer();
       HumPlayer hpl01 = new HumPlayer();
       
       do{
           roll = rnd.nextInt(6)+1;
           tr[0] = pl01.guess();
           tr[1] = hpl01.guess();
           
           System.out.println("Roll: " + roll);
           System.out.println("Try: " + tr[0]);
           System.out.println();
       }while((roll != tr[0]) && ((roll != tr[1])));
    }
}
