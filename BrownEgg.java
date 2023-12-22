import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrownEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrownEgg extends Egg
{
    /**
     * Act - do whatever the BrownEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setScoreOrLife(){
        MyWorld.score.add(5); // untuk telur warna coklat jika menyentuk keranjang akan menambah skor 5
        Greenfoot.playSound("ding.wav");
    }
}
