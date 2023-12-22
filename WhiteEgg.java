import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteEgg extends Egg
{
    /**
     * Act - do whatever the WhiteEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setScoreOrLife(){
        MyWorld.score.add(5); // untuk telur warna putih jika menyentuk keranjang akan menambah skor 5
        Greenfoot.playSound("ding.wav");
    }
}
