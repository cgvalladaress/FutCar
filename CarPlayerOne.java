import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarPlayerOne here.
 * 
 * @CarloL
 * @1.00
 */
public class CarPlayerOne extends Actor
{
    int posX;
    int posY;
    
    public CarPlayerOne()
    {
        setRotation(0);  
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
        
        if( Greenfoot.isKeyDown( "a" ) )
            posX -= 3;
        else if( Greenfoot.isKeyDown( "d" ) )
            posX += 3;            
        else if( Greenfoot.isKeyDown( "s" ) )
            posY += 3;            
        else if( Greenfoot.isKeyDown( "w" ) )
            posY -= 3;
        
        setLocation(posX , posY);
        
        estaChocandoPelota();
        estaChocandoCarroRojo();
    }
    
    public void golpe()
    {
        Actor Pelota;
        Pelota = getOneObjectAtOffset(0, 0, Pelota.class);
        if (Pelota != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Pelota);
        }
    }
    private void estaChocandoPelota(){
        if (isTouching(Pelota.class))
        {
            posX = -posX;
        }
    }
    private void estaChocandoCarroRojo(){
        if (isTouching(CarPlayerTwo.class))
        {
            posX = -posX;
        }
    }
}
