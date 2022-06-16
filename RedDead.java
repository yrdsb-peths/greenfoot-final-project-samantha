import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedDead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedDead extends Actor
{
    /**
     * Act - do whatever the RedDead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y+8);
        
        if(getY() > getWorld().getHeight()-10)
        {
            getWorld().removeObject(this);
        }
    }
}
