import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class MyWorld extends World
{
    public static int time = 1000;
    
    // constructor
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); // adjusted dimensions to be the same as the image for the background
        
        Red red = new Red();
        addObject(red, 300, 330);
        
        spawnMushroom();
    }
    
    public void act()
    {
        time--;
        showText("TIME: " + time, 50, 25);
        if(time<=0)
        {
            Greenfoot.stop();
        }
    }
    
    public void spawnMushroom()
    {
        int x = 600;
        int y = 334; 
        Mushroom mushroom = new Mushroom();
        addObject(mushroom, x, y);
    }
}
