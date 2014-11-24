/**
*  <Describe that the Racer class does>
*
*  @author Alexander
*  @version November 5
*/
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Racer extends Athlete {

   public Racer(int y)
   {
   super(1, y, Display.EAST, Display.INFINITY);
   }
   public void jumpRight()
   {
   turnLeft();
   move();
   turnRight();
   move();
   turnRight();
   move();
   turnLeft();
   }
   public void jumpLeft()
   {
   turnRight();
   move();
   turnLeft();
   move();
   turnLeft();
   move();
   turnRight();
   }
   public void sprint (int n)
   {
      for(int k=1; k  <= n; k++)
      move();
   }
   public void put (int n)
   {
   for(int k=1; k<= n; k++)
      putBeeper();
   }
   public void pick (int n)
   {
   for(int k=1; k<= n; k++)
      pickBeeper();
   }
   public static void shuttle(Racer arg){
   arg.move();
   arg.jumpRight();
   arg.sprint(2);
   arg.pick(7);
   arg.turnAround();
   arg.sprint(2);
   arg.jumpLeft();
   arg.move();
   arg.put(7);
   arg.turnAround();
   arg.move();
   arg.jumpRight();
   arg.sprint(4);
   arg.pick(5);
   arg.turnAround();
   arg.sprint(4);
   arg.jumpLeft();
   arg.move();
   arg.put(5);
   arg.turnAround();
   arg.move();
   arg.jumpRight();
   arg.sprint(6);
   arg.pick(3);
   arg.turnAround();
   arg.sprint(6);
   arg.jumpLeft();
   arg.move();
   arg.put(3);
   arg.turnAround();
   arg.move();
 
   }  
  
  
   public static void main(String[] args) {
          
   Display.openWorld("maps/shuttle.map");
   Display.setSize(10, 10);
   Display.setSpeed(8);
   
   Racer pete = new Racer(7);
   Racer alex = new Racer(4);
   Racer jack = new Racer(1);
   
   shuttle(pete);
   shuttle(alex);
   shuttle(jack);
     
}

}