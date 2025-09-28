/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author rinoa
 */
public class PraktikumPBO_6 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("ikan", 2);
        System.out.println("--Kucing--");
        kucing.bersuara();
        kucing.makan("ikan");        // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2);     // Memanggil metode makan() yang overloaded
        
        System.out.println("--Anjing--");
        Anjing anjing = new Anjing("daging", 3);
        anjing.bersuara();
        anjing.makan("daging");
        anjing.makan("daging", 3);
    }
}

