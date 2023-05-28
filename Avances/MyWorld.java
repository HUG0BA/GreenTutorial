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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Balloon balloon = new Balloon();
        addObject(balloon,284,30);
        Balloon balloon2 = new Balloon();
        addObject(balloon2,27,323);
        Balloon balloon3 = new Balloon();
        addObject(balloon3,578,338);
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
    }
}
