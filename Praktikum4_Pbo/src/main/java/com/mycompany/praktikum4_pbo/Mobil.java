/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4_pbo;

/**
 *
 * @author acer
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfoMobil() {
        // Memanggil method dari superclass
        tampilkanInfoKendaraan();

        // Menampilkan tambahan info dari subclass
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}