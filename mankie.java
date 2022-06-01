import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mankie extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[5] ;
    
    public mankie()
    {
        for(int i = 0; i < 5; i++)
        {
            idle[i] = new GreenfootImage("images/Mankie_idle/idle" + i + ".png" + ".png");
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 1;
    public void animateMankie()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    
    
    String name;
    {
        this.name = name;
    }
    public void act() 
    {
        
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(4);
        }
        if(isTouching(Berry.class))
        {
            removeTouching(Berry.class);
             Greenfoot.playSound("sounds/bearGrowl.mp3");
            MyWorld world = (MyWorld) getWorld();
            world.spawnBerry();
            world.increaseScore();
            
        }
        
        animateMankie();
    }    
    
}
