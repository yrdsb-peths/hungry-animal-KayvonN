import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel = new Label(score, 80);

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1, false); 
        mankie drip = new mankie();
        addObject(drip, getWidth() / 2, getHeight() /2);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 40, 40);
    
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
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
 
}
