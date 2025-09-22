/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author rinoa
 */
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    public void suara() {
        System.out.println(nama + " bersuara: Meong!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kucing itu feline.");
    }
}
