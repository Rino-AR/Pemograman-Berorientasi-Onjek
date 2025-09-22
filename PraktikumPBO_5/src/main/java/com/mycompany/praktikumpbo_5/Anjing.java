/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author rinoa
 */
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    public void suara() {
        System.out.println(nama + " bersuara: Woof woof!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Anjing itu pierro.");
    }
}
