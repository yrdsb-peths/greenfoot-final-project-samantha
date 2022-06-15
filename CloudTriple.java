import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The triple clouds in the sky
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class CloudTriple extends Actor
{
    /**
     * Act - do whatever the CloudTriple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
