import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class MyWorld extends World
{
    private static int timeLeft = 1000;
    public static int score = 0;

    // constructor
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        //score = 0;
        prepare();
        
        spawnMushroom();
    }

    public void act()
    {
        showText("Score: " + score, 50, 25);
        
        timeLeft--;
        showText("TIME: " + timeLeft, 50, 50);
        /*
        if(timeLeft<=0)
        {
            Greenfoot.stop();
        }
        */
    }
    
    /**
     * This method spawns a mushroom at the right end of the screen
     */
    public void spawnMushroom()
    {
        int x = 600;
        int y = 334; 
        Mushroom mushroom = new Mushroom();
        addObject(mushroom, x, y);
    }
    
    /**
     * This method prepares the scenery of the game
     */
    private void prepare() // put the prepare method at the bottom because it's really long
    {
        // hills
        HillBig hillBig = new HillBig();
        addObject(hillBig,65,320);
        HillSmall hillSmall = new HillSmall();
        addObject(hillSmall,464,331);

        //bushes
        BushSingle bushSingle = new BushSingle();
        addObject(bushSingle,564,332);
        BushDouble bushDouble = new BushDouble();
        addObject(bushDouble,164,332);
        BushTriple bushTriple = new BushTriple();
        addObject(bushTriple,359,332);

        // clouds
        Cloud cloud = new Cloud();
        addObject(cloud,91,140);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,561,48);
        CloudDouble cloudDouble = new CloudDouble();
        addObject(cloudDouble,268,85);
        CloudTriple cloudTriple = new CloudTriple();
        addObject(cloudTriple,426,172);

        Ground ground = new Ground();
        addObject(ground,588,372);
        Ground ground2 = new Ground();
        addObject(ground2,2331,372);
        
        Coin coin = new Coin();
        addObject(coin,394,332);

        // character
        Red red = new Red();
        addObject(red, 300, 330);
    }
}
