import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        super(585, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // variabel brown digunakan untuk menyimpan angka random, yg digunakan untuk menentukan posisi ayam scr acak
        int brown = Greenfoot.getRandomNumber(585); 
        // buat objek ayam
        BrownChicken brownChicken = new BrownChicken();
        // tambahkan ayam kedalam world, dengan posisi X sesuai angka acak
        addObject(brownChicken,brown,240);
        // memanggil function setLocationChicken pada class chicken untuk menentukan arah gerak ayam
        brownChicken.setLocationChicken(brown);

        int white = Greenfoot.getRandomNumber(585);
        WhiteChicken whiteChicken = new WhiteChicken();
        addObject(whiteChicken,white,240);
        whiteChicken.setLocationChicken(white);
    }
}
