import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class Red extends Actor
{
    GreenfootImage[] runRight = new GreenfootImage[4];
    GreenfootImage[] runLeft = new GreenfootImage[4];
    private boolean isFacingRight = true; // initial position
    
    public Red()
    {
        for(int i=0; i<runRight.length; i++)
        {
            runRight[i] = new GreenfootImage("images/run/run" + i + ".png");
            runRight[i].scale(50,35);
            runLeft[i] = new GreenfootImage("images/run/run" + i + ".png");
            runLeft[i].mirrorHorizontally();
            runLeft[i].scale(50,35);
        }
        
        setImage(runRight[0]); // inital image
    }
    
    // animate
    int curIndex = 0;
    public void animateRun()
    {
        if(isFacingRight)
        {
            setImage(runRight[curIndex]);
        }
        else // is facing left
        {
            setImage(runLeft[curIndex]);
        }
        curIndex++;
        curIndex %= runRight.length;
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            isFacingRight = false;
            move(-3);
            animateRun();
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            isFacingRight = true;
            move(3);
            animateRun();
        }
    }
}
