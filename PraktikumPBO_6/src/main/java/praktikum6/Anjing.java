/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author rinoa
 */
public class Anjing extends Hewan {
    public Anjing(String makanan, int jumlah) {
        super(makanan, jumlah);
    }
    
    @Override
    public void bersuara() {
        System.out.println("Woof woof");
    }
}
