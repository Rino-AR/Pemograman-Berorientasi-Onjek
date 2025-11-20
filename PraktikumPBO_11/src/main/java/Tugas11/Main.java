/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {

        Pengarang a1 = new Pengarang("Tere Liye");
        Pengarang a2 = new Pengarang("Andrea Hirata");

        Perpustakaan p = new Perpustakaan();

        p.tambahBuku(new Buku("Bumi", a1));
        p.tambahBuku(new Buku("Laskar Pelangi", a2));

        p.tampilBuku();
    }
}
