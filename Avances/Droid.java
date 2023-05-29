import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Droid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Droid extends Actor
{
    /**
     * Act - do whatever the Balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int wtime = 0;
    private int ftime = 0;
    public void act()
    {
        // Add your action code here.
        move(2);
        randomTurn();
        turnAtEdge();
        if(Greenfoot.getRandomNumber(300) < 10 && ftime <= 0){
            fire();
            Greenfoot.playSound("blaster.mp3");
            ftime = 30;
        }
        ftime = ftime - 1;
        
        wtime=wtime+1;
        if (wtime==18) wtime=0;
        else if (wtime==0) setImage("droidWalk1.png");
        else if (wtime==6) setImage("droidWalk2.png");
        else if (wtime==12) setImage("droidWalk3.png");

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
    
    
    
    public void fire(){
        Bolt bolt = new Bolt();
        getWorld().addObject(bolt, getX(), getY());
        bolt.setRotation(getRotation());
        bolt.move(10);
    }
}
