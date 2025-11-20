/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku("OOP for Beginner");
        Buku buku2 = new Buku("Java language");
    
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
    
        perpustakaan.infoPerpustakaan();
    }
}
