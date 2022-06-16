import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreenWorld here.
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class TitleScreenWorld extends World
{
    
    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // title
        Title title = new Title();
        addObject(title, getWidth()/2, 100);
        
        // "press enter to start"
        StartText start = new StartText();
        addObject(start, getWidth()/2, 280);
        
        // red (mario)
        TitleScreenRed red = new TitleScreenRed();
        addObject(red, 170, 330);
        
        // green (luigi)
        TitleScreenGreen green = new TitleScreenGreen();
        addObject(green, 430, 330);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            InstructionsWorld world = new InstructionsWorld();
            Greenfoot.setWorld(world);
        }
    }
}
