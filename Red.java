import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Mario class is the character played by the player
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class Red extends Actor
{
    public boolean alive = true;
    
    // for running animation
    GreenfootImage[] runRight = new GreenfootImage[6];
    GreenfootImage[] runLeft = new GreenfootImage[6];
    int curIndex = 0;
    
    private boolean isFacingRight = true; // initial position
    
    // for jumping
    private final int GRAVITY = 1;
    private int velocity;
    
    public Red()
    {
        setImage("images/RedIdle.png");
        GreenfootImage idle = getImage();
        idle.scale(50,35);
        
        // running
        for(int i=0; i<runRight.length; i++)
        {
            runRight[i] = new GreenfootImage("images/RedWalk/RedWalk" + i + ".png");
            runRight[i].scale(50,35);
            runLeft[i] = new GreenfootImage("images/RedWalk/RedWalk" + i + ".png");
            runLeft[i].mirrorHorizontally();
            runLeft[i].scale(50,35);
        }
        //setImage("images/RedIdle.png"); // inital image
        
        velocity = 0;
    }
    
    public void act()
    {
        move();
        
        fall();
        if(alive && Greenfoot.isKeyDown("space") && isOnSolidGround())
        {
            jump();
        }
        
        MyWorld world = new MyWorld();
        if(isTouching(Coin.class))
        {
            removeTouching(Coin.class);
            world.score += 5;
        }
        
        // gets hit by mushroom
        if(isTouching(Mushroom.class))
        {
            alive = false;
            setImage("images/RedDead.png");
        }
    }

    /**
     * This method animates the character when running
     */
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
    
    /**
     * This method holds the controls for moving the character
     */
    public void move()
    {
        if(alive && Greenfoot.isKeyDown("left"))
        {
            isFacingRight = false;
            move(-3);
            animateRun();
        }
        else if(alive && Greenfoot.isKeyDown("right"))
        {
            isFacingRight = true;
            move(3);
            animateRun();
        }
    }
    
    /**
     * This method makes the character fall when they are above the ground and accompanies the jump method
     */
    public void fall()
    {
        setLocation(getX(), getY()+velocity);
        if(isOnSolidGround())
        {
            velocity = 0; //doesn't fall on ground
        }
        else
        {
            velocity += GRAVITY; // falls when not on ground
        }
    }
    
    /**
     * This method allows for the player to jump
     */
    public void jump()
    {
        velocity = -15;
        setImage("images/RedJump.png");
        GreenfootImage jump = getImage();
        jump.scale(27,30);
    }
    
    /**
     * This method checks if the character is on solid ground
     */
    public boolean isOnSolidGround()
    {
        boolean isOnGround = false;
        if(getY() > getWorld().getHeight()-80)
        {
            isOnGround = true;
        }
        
        return isOnGround;
    }
}
