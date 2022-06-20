import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the ground that the character walks on
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(-3);
        }
    }
}
