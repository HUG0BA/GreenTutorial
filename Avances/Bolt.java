import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bolt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bolt extends Actor
{
    /**
     * Act - do whatever the Bolt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean removed = false;
    boolean reflect;
    public void act()
    {
        // Add your action code here.
        
        move(5);
        tryToKillJedi();
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
             
    }

    
    public void tryToKillJedi(){
        Jedi jedi;
        jedi = (Jedi)getOneIntersectingObject(Jedi.class);
        
        if (jedi != null && getNeighbours(getImage().getWidth()/1, false, Jedi.class).contains(jedi) && jedi.hitsJedi(this))
        {
            reflect = jedi.damage();
            if (reflect){
                turn(180); 
            }
            else
            {
                getWorld().removeObject(jedi);
            }
        }
    }
    
    public void killAtEdge(){
        
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5){
            getWorld().removeObject(this);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5){
            getWorld().removeObject(this);
        }
    }
}
