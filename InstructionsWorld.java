import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The instructions for the game will be shown in this world.
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class InstructionsWorld extends World
{

    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     */
    public InstructionsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        showText("HOW TO PLAY",300,110);
        
        showText("Press the LEFT and RIGHT arrow keys to move.",300,170);
        showText("Press SPACE to jump.",320,200);
        showText("Collect     & evade       until the time runs out.",320,230);
        CoinStationary coinStationary = new CoinStationary();
        addObject(coinStationary,196,228);
        MushroomLocked mushroomLocked = new MushroomLocked();
        addObject(mushroomLocked,298,231); 
        
        showText("Press SPACE to begin",300,290);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
