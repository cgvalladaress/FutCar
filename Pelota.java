import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    int xMoveVal = 2;
    int yMoveVal = 2;
    
    public Pelota()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Pelota wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        setLocation(getX() - xMoveVal, getY() - yMoveVal);
        
        if (getX() < 5 || getX() > 670)
        {
            xMoveVal = xMoveVal * -1;
        }
        if (getY() < 5 || getY() > 465)
        {
            yMoveVal = yMoveVal * -1;
        }
        
    }
}
