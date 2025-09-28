/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author rinoa
 */
public class Hewan {
    public String makanan;
    public int jumlah;
    
    public Hewan(String makanan, int jumlah) {
        this.makanan = makanan;
        this.jumlah = jumlah;
    }
    
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
    
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
}
