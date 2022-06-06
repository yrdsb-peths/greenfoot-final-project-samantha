import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreenWorld here.
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class TitleScreenWorld extends World
{
    
    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // title
        Title title = new Title();
        addObject(title, getWidth()/2, 100);
        
        
    }
}
