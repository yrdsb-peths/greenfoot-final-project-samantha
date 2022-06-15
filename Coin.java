import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Coins that can be collected by the player
 * 
 * @author Samantha Ly
 * @version June 2022
 */
public class Coin extends Actor
{
    private GreenfootImage[] spin;
    int curIndex = 0;
    private SimpleTimer timer;
    
    public Coin()
    {
        spin = new GreenfootImage[12];
        for(int i=0; i<spin.length; i++)
        {
            spin[i] = new GreenfootImage("images/coin/coin" + i + ".png");
            spin[i].scale(17,20);
        }
        setImage(spin[0]);
        timer = new SimpleTimer();
        timer.mark();
    }
    
    /**
     * This method animates the coin to spin
     */
    public void animateSpin()
    {
        setImage(spin[curIndex]);
        curIndex++;
        curIndex %= spin.length;
        timer.mark();
    }
    
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateSpin();
    }
}
