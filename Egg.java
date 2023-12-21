import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // saat ayam bertelur, maka telur akan otomatis turun kebawah
        setLocation(getX(), getY() +2);
        
        if (getY() >= 795){
            getWorld().removeObject(this);
        }
    }
}
