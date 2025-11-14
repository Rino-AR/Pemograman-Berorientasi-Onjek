/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {

        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaLaptop = 6000000;
        double hargaRoti = 10000;

        double pajakLaptop = elektronik.hitungPajak(hargaLaptop);
        double pajakRoti = makanan.hitungPajak(hargaRoti);

        System.out.println("Harga Laptop :Rp " + hargaLaptop);
        System.out.println("Pajak Laptop :Rp " + pajakLaptop);

        System.out.println("\nHarga Roti :Rp " + hargaRoti);
        System.out.println("Pajak Roti :Rp " + pajakRoti);
    }
}

