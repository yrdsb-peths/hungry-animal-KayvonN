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
        super(600, 400, 1); 
        mankie drip = new mankie();
        addObject(drip, getWidth() / 2, getHeight() /2);
    
        Berry blubbery = new Berry();
        addObject(blubbery, 300, 0);

    }
    public void spawnBerry()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Berry berry = new Berry();
        addObject(berry, x, y);
    }
    
 
}
