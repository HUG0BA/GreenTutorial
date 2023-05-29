import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuMusic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuMusic extends Actor
{
    boolean playing = true;
    
    public void act()
    {
        
        if (playing == true){
            GreenfootSound music = new GreenfootSound("menuSaber.mp3");
            music.playLoop();
            playing = false;
            
        }
        
    }
}
