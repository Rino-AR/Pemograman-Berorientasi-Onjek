/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parktikum.pbo_9_abstrak;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        // Cobalah untuk membuat objek lain dari kelas kendaraan, apakah bisa?
        Kendaraan Avanza = new Mobil();
        Kendaraan Honda = new Sepeda();
        
        System.out.println("##Objek baru Avanza##");
        Avanza.berjalan();
        Avanza.info();
        
        System.out.println("##Objek baru Honda##");
        Honda.berjalan();
        Honda.info();
    }
}
