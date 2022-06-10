import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Actor
{
    private GreenfootImage[] walk = new GreenfootImage[8];
    
    public Mushroom()
    {
        //walkImages = new GreenfootImage[2];
        for(int i=0; i<walk.length; i++)
        {
            walk[i] = new GreenfootImage("images/mushroom/mushroom" + i + ".png");
            walk[i].scale(40,25);
        }
        setImage(walk[0]);
    }
    
    int curIndex = 0;
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
        
        MyWorld world = (MyWorld) getWorld();
        if(getX() < 5)
        {
            world.removeObject(this);
        }
    }
}
