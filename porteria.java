import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class porteria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class porteria extends Actor
{
    public porteria()
    {
        setRotation(-90);
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
            GanadorDos contador = new GanadorDos();
            world.addObject(contador,363,233);
            Greenfoot.playSound("goool.mp3");
        }
    }
}
