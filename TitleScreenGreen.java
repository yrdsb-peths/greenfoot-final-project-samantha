import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The green character on the title screen that is for decoration
 * 
 * @author Samantha Ly
 * @version May 2022
 */
public class TitleScreenGreen extends Actor
{
    private GreenfootImage green;
    
    public TitleScreenGreen()
    {
        green = getImage();
        green.scale(50,35);
        green.mirrorHorizontally();
    }
    
    /**
     * Act - do whatever the TitleScreenGreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
