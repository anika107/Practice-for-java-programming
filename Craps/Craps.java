
import java.util.Random;
public class Craps {
    private static final Random randomNumber =  new Random();
    private enum Status {
        CONTINUE, WON, LOST;
    }
    private static final int snake_eyes = 2;
    private static final int trey = 3;
    private static final int seven = 7;
    private static final int y_leven = 11;
    private static final int box_cars = 12;
    
    public void play(){
        int mypoint = 0;
        Status gameStatus;
        int sumOfdice = rolldice();
        
        switch(sumOfdice){
            case seven:
            case y_leven:
                gameStatus = Status.WON;
                break;
            case snake_eyes:
            case trey:
            case box_cars:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                mypoint = sumOfdice;
                System.out.println("Points is " + mypoint);
                break;
            
        }
        while(gameStatus == Status.CONTINUE){
            sumOfdice = rolldice();
            if(sumOfdice == mypoint){
                gameStatus = Status.WON;
            }
            else{
                gameStatus = Status.LOST;
            }
            
            if(gameStatus == Status.WON){
                System.out.println("Won!!!!");
            }
            else{
                System.out.println("Lost");    
            }
        }
    }
     public int rolldice(){
         int d = randomNumber.nextInt(7);
         int p = randomNumber.nextInt(7);
         int s = d + p;
         System.out.println(d + " + " + p + " = " + s);
         return s;
         
     } 
 
  


    
}
