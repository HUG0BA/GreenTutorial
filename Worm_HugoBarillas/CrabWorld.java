import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,272,278);
        Worm worm = new Worm();
        addObject(worm,379,119);
        Worm worm2 = new Worm();
        addObject(worm2,117,115);
        Worm worm3 = new Worm();
        addObject(worm3,460,317);
        Worm worm4 = new Worm();
        addObject(worm4,111,468);
        Worm worm5 = new Worm();
        addObject(worm5,119,302);
        Worm worm6 = new Worm();
        addObject(worm6,253,199);
        Worm worm7 = new Worm();
        addObject(worm7,280,48);
        Worm worm8 = new Worm();
        addObject(worm8,507,153);
        Worm worm9 = new Worm();
        addObject(worm9,267,384);
        Worm worm10 = new Worm();
        addObject(worm10,400,457);
        Worm worm11 = new Worm();
        addObject(worm11,472,448);
        Worm worm12 = new Worm();
        addObject(worm12,27,19);
        Lobster lobster = new Lobster();
        addObject(lobster,21,153);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,26,448);
        Worm worm13 = new Worm();
        addObject(worm13,242,501);
        Worm worm14 = new Worm();
        addObject(worm14,533,19);
        Worm worm15 = new Worm();
        addObject(worm15,540,531);
        worm11.setLocation(472,436);
        worm11.setLocation(471,448);
        Worm worm16 = new Worm();
        addObject(worm16,30,551);
    }
}
