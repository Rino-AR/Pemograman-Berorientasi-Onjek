/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rinoa
 */
class Perpustakaan {
    List<Buku> daftarBuku = new ArrayList<>();   // pakai ArrayList

    void tambahBuku(Buku b) {
        daftarBuku.add(b);
    }

    void tampilBuku() {
        System.out.println("\nDaftar Buku di Perpustakaan:");
        for (Buku b : daftarBuku) {
            b.infoBuku();
            System.out.println();
        }
    }
}
