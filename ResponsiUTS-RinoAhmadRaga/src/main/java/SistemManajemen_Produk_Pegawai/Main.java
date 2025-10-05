/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen_Produk_Pegawai;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        // 1. Output Produk
        System.out.println("1. Output Produk");
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        System.out.println( );
        
        // 2. Output Pegawai
        System.out.println("2. Output Pegawai");
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Rino", 5000000, 1000000);
        pegawaiTetap.tampilkanInfo();
        System.out.println( );
        
        // 3. Output Polimorfisme
        System.out.println("3. Output Polimorfisme");
        
        // Objek Makanan
        Produk snack = new Makanan("Snack", 15000, "2023-12-30");
        snack.tampilkanInfo();
        System.out.println();
        // Objek PegawaiKontrak
        Pegawai pegawaiKontrak = new PegawaiKontrak("Andi", 3000000, 12);
        pegawaiKontrak.tampilkanInfo();
    }
}
