/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregasi_Klub;

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        Klub klub = new Klub("White Base");
        
        Anggota anggota1 = new Anggota("Amuro Ray");
        Anggota anggota2 = new Anggota("Sayla Mass");
        Anggota anggota3 = new Anggota("Bright Noa");
        
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);
        
        klub.infoKlub();
    }
}
