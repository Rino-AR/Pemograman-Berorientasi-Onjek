/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;

/**
 *
 * @author rinoa
 */
class Buku {
    String judul;
    Pengarang pengarang;   // agregasi

    Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    void infoBuku() {
        System.out.println("Judul: " + judul);
        pengarang.infoPengarang();
    }
}
