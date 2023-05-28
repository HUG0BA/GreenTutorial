import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnowMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowMan extends Actor
{
    /**
     * Act - do whatever the SnowMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        checkKeys();
        turnAtEdge();
        tryToEatFruit();
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("a")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("d")){
            turn(5);
        }
    }
    
    
    public void turnAtEdge(){
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5){
            turn(45);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5){
            turn(-45);
        }
    }
    
    public void tryToEatFruit(){
        Actor fruit;
        fruit = getOneObjectAtOffset(0,0, Fruit.class);
        
        if (fruit != null)
        {
            World world;
            world = getWorld();
            world.removeObject(fruit);
            Greenfoot.playSound("eating.wav");
        }
    }
}
