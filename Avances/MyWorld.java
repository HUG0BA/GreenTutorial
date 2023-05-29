import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private Jedi theJedi;
    private int stime = 30;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        theJedi = new Jedi();
        addObject(theJedi, 300, 200);
        prepare();
    }
    
    public void act()
    {
        if (stime <= 0){
            spawner();
            stime = 30;
        }
        stime = stime - 1;
        
    }
    
    public Jedi getJedi()
    {
        return theJedi;
    }
    
    public void spawner()
    {
        if(Greenfoot.getRandomNumber(100) < 30)
        {   
     
            int x = Greenfoot.getRandomNumber(400);
            int y = Greenfoot.getRandomNumber(300);
            
            Droid droid = new Droid();
            addObject(droid, x, y);
            Fruit fruit = new Fruit();
            addObject(fruit, x, y);
        } 
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Fruit fruit = new Fruit();
        addObject(fruit,10,7);
        Fruit fruit2 = new Fruit();
        addObject(fruit2,586,9);
        Fruit fruit3 = new Fruit();
        addObject(fruit3,5,391);
        Fruit fruit4 = new Fruit();
        addObject(fruit4,587,394);
        Fruit fruit5 = new Fruit();
        addObject(fruit5,155,144);
        Fruit fruit6 = new Fruit();
        addObject(fruit6,474,154);
        Fruit fruit7 = new Fruit();
        addObject(fruit7,151,294);
        Fruit fruit8 = new Fruit();
        addObject(fruit8,457,284);
        fruit6.setLocation(458,136);
        Fruit fruit9 = new Fruit();
        addObject(fruit9,312,26);
        Fruit fruit10 = new Fruit();
        addObject(fruit10,309,375);
        fruit5.setLocation(146,104);
        fruit7.setLocation(154,263);
        fruit6.setLocation(455,92);
        fruit8.setLocation(460,256);
        SnowMan snowMan = new SnowMan();
        addObject(snowMan,297,201);
        Music music = new Music();
        addObject(music,556,217);
        removeObject(music);
        snowMan.setLocation(300,205);
        removeObject(snowMan);
        Jedi jedi = new Jedi();
        addObject(jedi,300,187);
        fruit9.setLocation(312,35);
        Droid droid = new Droid();
        addObject(droid,312,35);
        Droid droid2 = new Droid();
        addObject(droid2,68,334);
        Droid droid3 = new Droid();
        addObject(droid3,545,329);
        removeObject(jedi);
        removeObject(fruit3);
        removeObject(fruit);
        removeObject(fruit2);
        removeObject(fruit4);
        removeObject(fruit10);
        removeObject(fruit9);
        fruit5.setLocation(165,108);
        droid.setLocation(311,52);
        droid2.setLocation(66,320);
        droid3.setLocation(556,348);
        droid2.setLocation(44,356);
        droid.setLocation(303,44);
        fruit5.setLocation(135,83);
        fruit7.setLocation(116,292);
        fruit6.setLocation(469,70);
        fruit6.setLocation(460,71);
        droid.setLocation(328,50);
        fruit6.setLocation(375,100);
        fruit6.setLocation(498,92);
        fruit8.setLocation(493,282);
        fruit6.setLocation(487,67);
        fruit8.setLocation(109,286);
        fruit8.setLocation(486,298);
        droid2.setLocation(570,361);
        droid.setLocation(312,18);
        droid2.setLocation(41,358);
        droid2.setLocation(33,345);
        droid3.setLocation(596,398);
        Music music2 = new Music();
        addObject(music2,596,398);
        droid3.setLocation(546,331);
    }
}
