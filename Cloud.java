import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The singular clouds in the background
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class Cloud extends Actor
{
    public void act()
    {
        // clouds move as player moves
        if(Greenfoot.isKeyDown("left"))
        {
            move(3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(-3);
        }
        
        // when clouds go off screen, "new" clouds appear in sky
        if(getX()==0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(170)+30);
        }
        else if(getX()==getWorld().getWidth()-1)
        {
            setLocation(0,Greenfoot.getRandomNumber(170)+30);
        }
    }
}
