import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EasterEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasterEgg extends Egg
{
    /**
     * Act - do whatever the EasterEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setScoreOrLife(){
        MyWorld.score.add(15); // untuk telur paskah jika menyentuk keranjang akan menambah skor 15
        Greenfoot.playSound("ding.wav");
    }
    
    private void remEgg() {
        getWorld().removeObject(this);
    }
    
    public void act(){
        // saat ayam bertelur, maka telur akan otomatis turun kebawah
        setLocation(getX(), getY() +4);
        
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
