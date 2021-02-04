package bookClasses;

import java.util.*;


public class turtlelab
{
  public static void main(String[] args)
  {
    //Random randNumGen = new Random();
    //World world = new World(false);
    //Turtle me = new Turtle(world);

    // Turtle[] turtleArray = new Turtle[1000];
    // for (int i=0; i < 1000; i++)
      // turtleArray[i] = new Turtle(world);

    // for (int i=0; i < 1000; i++)
    // {
      // turtleArray[i].turn(randNumGen.nextInt(360));
      // turtleArray[i].forward(100);
    // }
    // me.moveTo(200,200);
    // me.square(200);
    // world.setVisible(true);
    
    
    
   
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.drawsquare(25);
    t1.randomwalk(3,2);
    t1.drawrec(2,4);
    t1.drawequilateralTriangle(5);
    t1.drawhex(4);
  }
}