import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PorteriaTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PorteriaTwo extends Actor
{
    public PorteriaTwo()
    {
        setRotation(-270);
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        // Add your action code here.
        entraPelota();
    }
    private void entraPelota()
    {
        if (isTouching(Pelota.class))
        {
            World world;
            world = getWorld();
            GanadorUno contador = new GanadorUno();
            world.addObject(contador,363,233);
        }
    }
}
