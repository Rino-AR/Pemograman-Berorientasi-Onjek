/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja ("Closure", 27, "Software Developer", 10000000);
        
        System.out.println(pekerja1.toString());
        
        pekerja1.setNama("Ada Church");
        
        System.out.println("\n-Setelah Pengubahan Nama-\n\n" + pekerja1.toString());
    }
}
