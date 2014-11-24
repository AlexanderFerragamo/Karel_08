/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <...>
 * @version <...>
 *
 */
 
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class SteepleChaseRacer extends Racer {
	
	  public SteepleChaseRacer(int y)
   {
   super(y);
   }
      public void jumpLeft()
   {
   turnRight();
   move();
   move();
   turnLeft();
   move();
   move();
   move();
   move();
   turnLeft();
   move();
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
   @Override
	public void jumpRight() {
	
   turnLeft();
   move();
   move();
   turnRight();
   move();
   move();
   move();
   move();
   turnRight();
   move();
   move();
   turnLeft();	
	}

}
