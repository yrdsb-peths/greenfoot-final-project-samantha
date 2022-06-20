import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the animated coin shown after the game ends
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class CoinStationary extends Actor
{
    private GreenfootImage coin;
    
    public CoinStationary()
    {
        coin = getImage();
        coin.scale(17,20);
    }
}
