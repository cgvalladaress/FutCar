import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @CarloL 
 * @1.00
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(693, 490, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CarPlayerOne carPlayerOne = new CarPlayerOne();
        addObject(carPlayerOne,127,239);
        CarPlayerTwo carPlayerTwo = new CarPlayerTwo();
        addObject(carPlayerTwo,560,240);
        carPlayerTwo.setLocation(554,228);
        Pelota pelota = new Pelota();
        addObject(pelota,363,233);
        pelota.setLocation(464,237);
        pelota.setLocation(344,259);
        carPlayerTwo.setLocation(572,239);
        PorteriaTwo porteriaTwo = new PorteriaTwo();
        addObject(porteriaTwo,572,239);
        porteriaTwo.setLocation(665,251);
        porteria porteria = new porteria();
        addObject(porteria,35,226);
        porteria.setLocation(40,266);
        porteria.setLocation(45,266);
        pelota.setLocation(336,247);
        carPlayerTwo.setLocation(565,243);
        porteria.setLocation(74,280);
        porteria.setLocation(49,252);
        porteriaTwo.setLocation(660,256);
        porteriaTwo.setLocation(648,256);
        porteriaTwo.setLocation(651,264);
        pelota.setLocation(348,247);
        porteria.setLocation(28,251);
        porteriaTwo.setLocation(657,255);
        pelota.setLocation(334,231);
        porteria.setLocation(35,252);
        porteriaTwo.setLocation(629,245);
        pelota.setLocation(333,239);
        porteriaTwo.setLocation(648,273);
        porteria.setLocation(26,232);
        porteriaTwo.setLocation(629,231);
        porteria.setLocation(22,250);
        porteriaTwo.setLocation(632,260);
        porteria.setLocation(44,245);
        porteriaTwo.setLocation(656,245);
        porteriaTwo.setLocation(658,275);
        porteriaTwo.setLocation(620,240);
        porteriaTwo.setLocation(652,262);
        porteriaTwo.setLocation(651,255);
        porteriaTwo.setLocation(651,254);
        porteriaTwo.setLocation(658,251);
        porteriaTwo.setLocation(643,272);
        porteriaTwo.setLocation(636,269);
        porteriaTwo.setLocation(637,247);
        porteriaTwo.setLocation(637,270);
        porteriaTwo.setLocation(647,236);
    }
}
