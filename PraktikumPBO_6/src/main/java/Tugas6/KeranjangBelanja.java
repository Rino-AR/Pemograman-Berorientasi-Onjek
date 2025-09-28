/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author rinoa
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.hargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanProduk() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getNama() + " -> Harga Asli: Rp" + p.getHarga() +
                               " | Setelah Diskon: Rp" + p.hargaSetelahDiskon());
        }
    }
}
