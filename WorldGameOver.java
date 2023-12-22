import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldGameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public WorldGameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(585, 800, 1);
        
        // buat gambar game over berada ditengah
        addObject(new GameOver(), this.getWidth() /2, this.getHeight() /2);
        // buat tombol jika game over
        addObject(new Replay(), this.getWidth() /2, 600);
    }
}
