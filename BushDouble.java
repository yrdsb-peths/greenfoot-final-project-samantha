import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The double bush in the background
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class BushDouble extends Actor
{
    public void act()
    {
        // bush moves as player moves
        if(Greenfoot.isKeyDown("left"))
        {
            move(3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(-3);
        }
        
        // when bush go off screen, a "new" bush appears in the scenery
        if(getX()==0)
        {
            setLocation(getWorld().getWidth()-1,332);
        }
        else if(getX()==getWorld().getWidth()-1)
        {
            setLocation(0,332);
        }
    }
}
