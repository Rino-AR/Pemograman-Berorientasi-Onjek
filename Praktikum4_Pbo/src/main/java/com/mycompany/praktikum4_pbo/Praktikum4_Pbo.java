/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum4_pbo;

/**
 *
 * @author acer
 */
public class Praktikum4_Pbo {
    public static void main(String[] args) {
        // Membuat objek dari class Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("Sepeda Motor", 120, "Mesin Bensin");
        System.out.println("=== Informasi Kendaraan ===");
        kendaraan1.tampilkanInfoKendaraan();

        System.out.println();

        // Membuat objek dari class Mobil (turunan dari Kendaraan)
        Mobil mobil1 = new Mobil("Toyota Avanza", 180, "Mesin Bensin", 4);
        System.out.println("=== Informasi Mobil ===");
        mobil1.tampilkanInfoMobil();
    }
} 
