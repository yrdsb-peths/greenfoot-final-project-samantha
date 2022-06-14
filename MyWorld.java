import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Samantha Ly
 * @version May-June 2022
 */
public class MyWorld extends World
{
    int leftBound = 0;
    int rightBound = getWidth();

    public static int timeLeft = 1000;

    // constructor
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); // adjusted dimensions to be the same as the image for the background

        //spawnMushroom();
        prepare();
    }

    public void act()
    {
        //timeLeft--;
        //showText("TIME: " + timeLeft, 50, 25);
        if(timeLeft<=0)
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
    
    private void prepare()
    {
        // background
        Hill hill = new Hill();
        addObject(hill,66,321);
        SmallHill smallHill = new SmallHill();
        addObject(smallHill,465,333);
        Cloud cloud = new Cloud();
        addObject(cloud,250,98);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,542,72);
        BushTriple bushTriple = new BushTriple();
        addObject(bushTriple,358,333);
        BushSingle bushSingle = new BushSingle();
        addObject(bushSingle,650,334);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,1524,99);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,1818,73);
        CloudTriple cloudTriple = new CloudTriple();
        addObject(cloudTriple,2059,94);
        BushTriple bushTriple2 = new BushTriple();
        addObject(bushTriple2,1632,332);
        BushSingle bushSingle2 = new BushSingle();
        addObject(bushSingle2,1923,332);
        Hill hill2 = new Hill();
        addObject(hill2,2616,320);
        SmallHill smallHill2 = new SmallHill();
        addObject(smallHill2,3013,330);
        BushTriple bushTriple3 = new BushTriple();
        addObject(bushTriple3,2908,331);
        BushDouble bushDouble = new BushDouble();
        addObject(bushDouble,1143,331);
        Hill hill3 = new Hill();
        addObject(hill3,1341,320);
        SmallHill smallHill3 = new SmallHill();
        addObject(smallHill3,1738,331);
        CloudDouble cloudDouble = new CloudDouble();
        addObject(cloudDouble,2285,72);
        BushDouble bushDouble2 = new BushDouble();
        addObject(bushDouble2,2416,332);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,2804,96);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,3095,73);
        CloudTriple cloudTriple2 = new CloudTriple();
        addObject(cloudTriple2,3333,96);
        BushSingle bushSingle3 = new BushSingle();
        addObject(bushSingle3,3202,331);
        CloudDouble cloudDouble2 = new CloudDouble();
        addObject(cloudDouble2,3559,72);
        Cloud cloud7 = new Cloud();
        addObject(cloud7,4076,97);

        Ground ground = new Ground();
        addObject(ground,588,372);
        Ground ground2 = new Ground();
        addObject(ground2,2331,372);

        // character
        Red red = new Red();
        addObject(red, 300, 330);
    }
}
