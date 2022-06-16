import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinishWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishWorld extends World
{

    /**
     * Constructor for objects of class FinishWorld.
     * 
     */
    public FinishWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.playSound("win music.mp3");
    }
    
    public void act()
    {
        showText("CONGRATULATIONS!",300,140);
        showText("You evaded the mushrooms!",300,170);
        
        CoinStationary coinStationary = new CoinStationary();
        addObject(coinStationary,280,200);
        showText("x " + MyWorld.coins,320,200);
        
        MushroomLocked mushroomLocked = new MushroomLocked();
        addObject(mushroomLocked,280,230);
        showText("x " + MyWorld.mushrooms,320,230);
        
        showText("SCORE: " + MyWorld.score,300,260);
    }
}
