import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends Actor
{
    /**
     * Act - do whatever the Balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(3);
        turnAtEdge();
        tryToKillSnowman();

    }
    
    public void randomTurn(){
        if(Greenfoot.getRandomNumber(100) < 10){
            turn(Greenfoot.getRandomNumber(40)-20);
        }
    }
    
    public void turnAtEdge(){
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5){
            turn(10);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5){
            turn(10);
        }
    }
    
    public void tryToKillSnowman(){
        Actor snowman;
        snowman = getOneObjectAtOffset(0,0, SnowMan.class);
        
        if (snowman != null)
        {
            World world;
            world = getWorld();
            world.removeObject(snowman);
            Greenfoot.playSound("die.wav");
        }
    }
}
