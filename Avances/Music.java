import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Actor
{
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean playing = true;
    
    public void act()
    {
        
        if (playing == true){
            GreenfootSound music = new GreenfootSound("goodMusic.mp3");
            music.playLoop();
            playing = false;
            
        }
        
    }
}
