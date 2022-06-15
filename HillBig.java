import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The big hill in the background
 * 
 * @author Samantha Ly 
 * @version June 2022
 */
public class HillBig extends Actor
{
    public void act()
    {
        // hill moves as player moves
        if(Greenfoot.isKeyDown("left"))
        {
            move(3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(-3);
        }
        
        // when hill go off screen, a "new" hill appears in the scenery
        if(getX()==0)
        {
            setLocation(getWorld().getWidth()-1,331);
        }
        else if(getX()==getWorld().getWidth()-1)
        {
            setLocation(0,331);
        }
    }
}
