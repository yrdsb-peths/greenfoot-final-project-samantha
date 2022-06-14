import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class Red extends Actor
{
    private boolean alive = true;
    
    // for running animation
    GreenfootImage[] runRight = new GreenfootImage[6];
    GreenfootImage[] runLeft = new GreenfootImage[6];
    
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
        move();
        
        fall();
        if(alive && Greenfoot.isKeyDown("space") && isOnSolidGround())
        {
            jump();
        }
        
        // gets hit by mushroom
        if(isTouching(Mushroom.class))
        {
            //removeTouching(Mushroom.class);
            alive = false;
            setImage("images/RedDead.png");
        }
    }
    
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
    
    public void fall()
    {
        setLocation(getX(), getY()+velocity);
        if(isOnSolidGround())
        {
            velocity = 0; //doesn't fall on ground
            
            /*
            // so that character doesn't go into the platform
            while(isOnSolidGround())
            {
                setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY()+1);
            */
        }
        else
        {
            velocity += GRAVITY; // falls when not on ground
        }
    }
    
    public void jump()
    {
        velocity = -15;
        setImage("images/RedJump.png");
        GreenfootImage jump = getImage();
        jump.scale(27,30);
    }
    
    public boolean isOnSolidGround()
    {
        boolean isOnGround = false;
        if(getY() > getWorld().getHeight()-80)
        {
            isOnGround = true;
        }
        
        // check if on a platform
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth/-2, imageHeight/2, Brick.class) != null || getOneObjectAtOffset(imageWidth/2, imageHeight/2, Brick.class) != null)
        {
            isOnGround = true;
        }
        
        return isOnGround;
    }
    
    /*
    public boolean canMoveLeft()
    {
        boolean canMoveLeft = true;
        
        //check if hit against LEFT side of platform
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset((imageWidth/-2)-3, imageHeight/-2, Brick.class) != null || getOneObjectAtOffset((imageWidth/-2)-3, (imageHeight/2)-1, Brick.class) != null)
        {
            canMoveLeft = false;
        }
        
        return canMoveLeft;
    }
    
    public boolean canMoveRight()
    {
        boolean canMoveRight = true;
        
        //check if hit against RIGHT side of platform
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset((imageWidth/2)+3, imageHeight/-2, Brick.class) != null || getOneObjectAtOffset((imageWidth/2)+3, (imageHeight/2)-1, Brick.class) != null)
        {
            canMoveRight = false;
        }
        
        return canMoveRight;
    }
    */
}
