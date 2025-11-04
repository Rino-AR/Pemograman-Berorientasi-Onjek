/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        Hewan Kaltsit = new Kucing();
        Hewan Doggo = new Anjing();
        
        Kaltsit.suara();
        Kaltsit.info();
        
        Doggo.suara();
        Doggo.info();
    }
}
