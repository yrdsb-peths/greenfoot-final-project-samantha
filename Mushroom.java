import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mushroom here.
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class Mushroom extends Actor
{
    private GreenfootImage[] walk = new GreenfootImage[8];
    
    public Mushroom()
    {
        for(int i=0; i<walk.length; i++)
        {
            walk[i] = new GreenfootImage("images/mushroom/mushroom" + i + ".png");
            walk[i].scale(40,25);
        }
        setImage(walk[0]);
    }
    
    int curIndex = 0;
    /**
     * This method animates the mushroom's walking
     */
    public void animateWalk()
    {
        setImage(walk[curIndex]);
        curIndex++;
        curIndex %= walk.length;
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x - 2, y);
        
        animateWalk();
        
        /*
         * adjustments to make it look like the mushroom is walking at a constant speed
         * because the moving background creates the illusion that the mushroom's speed changes
         */
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-1,y);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x-5,y);
        }
        
        MyWorld world = (MyWorld) getWorld();
        if(getX() < 5)
        {
            world.removeObject(this);
            world.spawnMushroom();
            world.score += 5;
            world.mushrooms++;
        }
    }
}
