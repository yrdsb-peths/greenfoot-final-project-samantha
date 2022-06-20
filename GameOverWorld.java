import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player will be brought to this world when they lose by touching a mushroom.
 * 
 * @author Samantha Ly 
 * @version June 2022
 */
public class GameOverWorld extends World
{
    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.playSound("sounds/death sound.mp3");
        
        RedDead redDead = new RedDead();
        addObject(redDead,300,1);
    }
    
    public void act()
    {
        showText("GAME OVER",300,140);
        showText("You touched a mushroom!",300,170);
        
        CoinStationary coinStationary = new CoinStationary();
        addObject(coinStationary,280,200);
        showText("x " + MyWorld.coins,320,200);
        
        MushroomLocked mushroomLocked = new MushroomLocked();
        addObject(mushroomLocked,280,230);
        showText("x " + MyWorld.mushrooms,320,230);
        
        showText("SCORE: " + MyWorld.score,300,260);
    }
}
