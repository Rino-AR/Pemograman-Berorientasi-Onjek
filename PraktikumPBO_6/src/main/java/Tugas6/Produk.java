/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author rinoa
 */
abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode abstrak untuk diskon
    public abstract double hitungDiskon();

    // Menghitung harga setelah diskon
    public double hargaSetelahDiskon() {
        return harga - hitungDiskon();
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}
