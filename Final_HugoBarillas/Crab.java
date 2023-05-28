import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * Hugo Daniel Barillas Ajin
     */
    public void act() 
    {
        moveAndTurn();
        eat();
        
    } 
    
    public void moveAndTurn()
    {
      move(5);
        //turn(5);
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }  
    }
    
    public void eat()
    {
        Actor worm;
        worm = getOneObjectAtOffset(0,0, Worm.class);
        
        if (worm != null)
        {
            World world;
            world = getWorld();
            world.removeObject(worm);
            Greenfoot.playSound("eat3.wav");
        }
    }
}
