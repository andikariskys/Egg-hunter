import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chicken extends Actor
{
    private int direction; //variabel ini digunakan untuk menentukan arah gerak ayam
    
    // variabel ini berisi angka secara acak, yang digunakan untuk menentukan kapan ayam akan bertelur
    private int time = Greenfoot.getRandomNumber(60); 

    /**
     * Act - do whatever the Chicken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setLocationChicken(int location_chicken_x){
        if (location_chicken_x <= 282){
            direction = -2; // jika lokasi ayam berada disebelah kiri, maka akan bergerak ke sebelah kiri
        } else {
            direction = 2; //sebaliknya
        }
    }

    public void act()
    {
        if (getX() <= 0) {
            // Jika objek mencapai batas kiri dunia
            direction = 2; // Ubah arah ke kanan
        }

        if (getX() >= getWorld().getWidth() - 1) {
            // Jika objek mencapai batas kanan dunia
            direction = -2; // Ubah arah ke kiri
        }
        
        setLocation(getX() + direction, getY()); //gerakkan ayam/objek
        
        time++;
        bertelur();
    }
    
    private void bertelur(){
        // jika value time lebih dari 180 fps (3 detik) maka ayam akan bertelur
        if (time >= 240){
            Greenfoot.playSound("chicken.wav");
            // variabel ini digunakan untuk menentukan telur maka yang akan muncul
            int jenis_telur = Greenfoot.getRandomNumber(5); 
            if (jenis_telur == 0){
                // jika jenis_telur value-nya 0 maka akan memunculkan telur berwarna coklat
                getWorld().addObject(new BrownEgg(), getX(), getY());
            } else if (jenis_telur == 1){
                // jika jenis_telur value-nya 1 maka akan memunculkan telur berwarna putih
                getWorld().addObject(new WhiteEgg(), getX(), getY());
            } else if (jenis_telur == 2){
                // jika jenis_telur value-nya 2 maka akan memunculkan telur paskah
                getWorld().addObject(new EasterEgg(), getX(), getY());
            } else if (jenis_telur == 3){
                // jika jenis_telur value-nya 3 maka akan memunculkan telur pecah berwarna coklat (obstacle)
                getWorld().addObject(new CrackedBrownEgg(), getX(), getY());
            } else {
                // jika jenis_telur value-nya 4 maka akan memunculkan telur pecah berwarna putih (obstacle)
                getWorld().addObject(new CrackedWhiteEgg(), getX(), getY());
            }
            
            // sesudah memunculkan telur, maka reset waktu agar ayam bertelur dengan waktu secara acak
            time = Greenfoot.getRandomNumber(120);
        }
    }
}
