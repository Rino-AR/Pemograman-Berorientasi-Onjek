/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author rinoa
 */
public class Kucing extends Hewan{
    public Kucing(String makanan, int jumlah) {
        super(makanan, jumlah); // panggil constructor Hewan
    }
    
    @Override
    public void bersuara() {
        System.out.println("Meong meong");
    }
}

