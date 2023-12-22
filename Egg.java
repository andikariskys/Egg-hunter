import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Egg extends Actor
{
    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    // buat method abstrac, karena dalam subclass ada yang menambah score dan ada juga yang mengurangi nyawa, jadi 
    // tergantung class masing-masing
    abstract void setScoreOrLife();
    
    private void remEgg() {
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        // saat ayam bertelur, maka telur akan otomatis turun kebawah
        setLocation(getX(), getY() +2);
        
        if (isTouching(Basket.class)){
            // jika telur menyentuh keranjang, maka akan melakukan:
            // panggil method abstract setScoreOfLife() untuk menambah score atau mengurangi nyawa (telur obstacle)
            setScoreOrLife();
            // jika sudah melakukan aksi tersebut, selanjutnya hapus telur
            remEgg();
        } else if (getY() >= 795){
            // jika telur tidak menyentuh keranjang dan turun hingga hampir menyentuh batas bawah, 
            // maka objek telur akan dihapus
            getWorld().removeObject(this);
        }
        
        if (MyWorld.nyawa.getValue() == 0){
            // cek apakah sisa nyawa = 0, jika iya maka tampilkan world game over
            Greenfoot.setWorld(new WorldGameOver());
        }
    }
}
