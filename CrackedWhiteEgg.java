import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrackedWhiteEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrackedWhiteEgg extends Egg
{
    /**
     * Act - do whatever the CrackedWhiteEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setScoreOrLife(){
        MyWorld.nyawa.add(-1); // untuk obstacle telur pecah maka akan mengurasi nyawa 1
        Greenfoot.playSound("egg-cracking.wav");
    }
}
