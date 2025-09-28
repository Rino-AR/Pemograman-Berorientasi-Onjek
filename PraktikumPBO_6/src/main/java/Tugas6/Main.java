/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Buku Java", 100000);
        Produk elektronik = new Elektronik("Laptop", 5000000);
        Produk pakaian = new Pakaian("Kaos", 200000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanProduk();
        System.out.println("Total Harga Setelah Diskon: Rp" + keranjang.hitungTotal());
    }
}
