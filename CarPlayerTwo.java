import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarPlayerTwo here.
 * 
 * @CarloL 
 * @1.00
 */
public class CarPlayerTwo extends Actor
{
    int posX;
    int posY;
    
    public CarPlayerTwo()
    {
        setRotation(-180);  
    }
    
    public void act() 
    {
        // Add your action code here.
        actulizarPosicion();
    }
    
    public void actulizarPosicion()
    {
        posX = getX();
        posY = getY();
        
        if( Greenfoot.isKeyDown( "left" ) )
            posX -= 3;
        else if( Greenfoot.isKeyDown( "right" ) )
            posX += 3;            
        else if( Greenfoot.isKeyDown( "down" ) )
            posY += 3;            
        else if( Greenfoot.isKeyDown( "up" ) )
            posY -= 3;
            
        setLocation( posX, posY );
        estaChocandoPelota();
        estaChocandoCarroAzul();
    }
    private void estaChocandoPelota(){
        if (isTouching(Pelota.class))
        {
            posX = -posX;
        }
    }
    private void estaChocandoCarroAzul(){
        if (isTouching(CarPlayerOne.class))
        {
            posX = -posX;
        }
    }
}
