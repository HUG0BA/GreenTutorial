import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jedi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jedi extends Actor
{
    private int wtime=0;
    private int atime=0;
    private int rtime=0;
    private int timer = 0;
    private boolean isWalking = true;
    private boolean isAttacking = false;
    private boolean canReflect = true;
    private boolean isAttacked = false;
    private int button;
    MouseInfo mouse =  Greenfoot.getMouseInfo(); 
    private int speed = 3;
    /**
     * Act - do whatever the Jedi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        if (timer <= 0) canReflect = true;
        if (timer > 0) canReflect = false;
        if(isWalking == true && isAttacking == false){
            move(speed);
            checkKeys();
            wtime=wtime+1;
            if (wtime==48) wtime=0;
            else if (wtime==0) setImage("walk1.png");
            else if (wtime==6) setImage("walk2.png");
            else if (wtime==12) setImage("walk3.png");
            else if (wtime==18) setImage("walk4.png");
            else if (wtime==24) setImage("walk5.png");
            else if (wtime==30) setImage("walk6.png");
            else if (wtime==36) setImage("walk7.png");
            else if (wtime==42) setImage("walk8.png");
        }
        else if(isAttacking == true && isWalking == false)
        {
            move(speed);
            if(atime == 16){
                atime = 0;
                isWalking = true;
                isAttacking = false;
            }
            else if (atime==0) setImage("attack1.png");
            else if (atime==4){ setImage("attack2.png"); Greenfoot.playSound("saber.mp3"); } 
            else if (atime==8) setImage("attack3.png");
            else if (atime==12){
                tryToDestroyDroid();
                setImage("attack4.png");
            }
            
            atime=atime+1;
        }
        else if(isAttacking == false && isWalking == false && isAttacked == true)
        {
            move(speed);
            if(rtime == 12){
                rtime = 0;
                timer = 15;
                isAttacked = false;
                isWalking = true;
                isAttacking = false; 
            }
            else if (rtime==0) setImage("reflect1.png");
            else if (rtime==3) setImage("reflect2.png"); 
            else if (rtime==9) setImage("reflect3.png");
            rtime=rtime+1;
                
            
            
        
        }
        turnAtEdge();
        tryToEatFruit();
        timer = timer - 1;
        
    }
    
    public void checkKeys()
    {

        MouseInfo mouse =  Greenfoot.getMouseInfo();  
        if(Greenfoot.mouseClicked(null)){ 
            
            button = mouse.getButton();  
            if(button == 1) 
            {
                speed = 2;
                isAttacking = true; 
                isWalking = false;
                     
            }  
            else if(button == 0){
                speed = 0;
                isWalking = false;
                isAttacking = false;
                
            }
        }  
        else{
            isWalking = true;
            isAttacking = false;
            speed = 3;
            if (Greenfoot.isKeyDown("a")){
            turn(-5);
            }
            
            if (Greenfoot.isKeyDown("d")){
            turn(5);
            }
            
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
    
    public void tryToDestroyDroid(){
        Actor droid;
        droid = getOneIntersectingObject(Droid.class);
        
        if (droid != null)
        {
            World world;
            world = getWorld();
            world.removeObject(droid);
            Greenfoot.playSound("destroyed.mp3");
        }
    }
    
    public boolean damage()
    {
        if(canReflect == false){
            Greenfoot.playSound("die.wav");
            return false;
        }
        else{
            speed = 2;
            isAttacked = true;
            isWalking = false;
            isAttacking = false; 
            return true;
        }
        
    }
    
    public boolean hitsJedi(Bolt bolt)
    {
    return getObjectsInRange(getImage().getWidth(), Bolt.class).contains(bolt);
    }
    
    
}
