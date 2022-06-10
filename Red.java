import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class Red extends Actor
{
    // for running animation
    GreenfootImage[] runRight = new GreenfootImage[4];
    GreenfootImage[] runLeft = new GreenfootImage[4];
    
    private boolean isFacingRight = true; // initial position
    
    // for jumping
    private final int GRAVITY = 1;
    private int velocity;
    
    public Red()
    {
        // running
        for(int i=0; i<runRight.length; i++)
        {
            runRight[i] = new GreenfootImage("images/run/run" + i + ".png");
            runRight[i].scale(50,35);
            runLeft[i] = new GreenfootImage("images/run/run" + i + ".png");
            runLeft[i].mirrorHorizontally();
            runLeft[i].scale(50,35);
        }
        setImage(runRight[0]); // inital image
        
        // jumping
        velocity = 0;
    }
    
    // animation for running
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
        // running
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
        
        // jumping
        fall();
        if(Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight()-80)
        {
            jump();
        }
        
        // gets hit by mushroom
        if(isTouching(Mushroom.class))
        {
            removeTouching(Mushroom.class);
        }
    }
    
    public void fall()
    {
        setLocation(getX(), getY()+velocity);
        if(getY() > getWorld().getHeight()-80)
        {
            velocity = 0;
        }
        else
        {
            velocity += GRAVITY;
        }
    }
    
    public void jump()
    {
        velocity = -15;
    }
}
