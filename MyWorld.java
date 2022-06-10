import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class MyWorld extends World
{
    boolean mushroom = true;
    
    // constructor
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); // adjusted dimensions to be the same as the image for the background
        
        Red red = new Red();
        addObject(red, 300, 330);
        
        spawnMushroom();
    }
    
    public void spawnMushroom()
    {
        int x = 600;
        int y = 334; 
        Mushroom mushroom = new Mushroom();
        addObject(mushroom, x, y);
    }
}
