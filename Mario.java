import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class Mario extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
    }
}
