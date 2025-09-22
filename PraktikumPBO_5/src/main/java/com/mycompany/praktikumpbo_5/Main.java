/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kal'tsit");
        Anjing anjing = new Anjing("Kay");

        System.out.println("# Informasi Kucing #");
        kucing.tampilkanInfo();
        kucing.suara();

        System.out.println("\n# Informasi Anjing #");
        anjing.tampilkanInfo();
        anjing.suara();
    }
}
