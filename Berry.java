import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blubbery here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Berry extends Actor
{
    /**
     * Act - do whatever the Blubbery wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation( x,y+2);//
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }    
        
}
