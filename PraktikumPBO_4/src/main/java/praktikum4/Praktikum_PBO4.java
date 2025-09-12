/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author rinoa
 */
public class Praktikum_PBO4 {
    public static void main(String[] args) {
        // Membuat objek kendaraan
        Kendaraan mobil = new Kendaraan("Toyota", "Avanza", 2020);

        // Menampilkan data awal
        System.out.println("Merek : " + mobil.getMerek());
        System.out.println("Model : " + mobil.getModel());
        System.out.println("Tahun : " + mobil.getTahun());

        // Mengubah data
        mobil.setModel("Innova");
        mobil.setTahun(2021);

        // Menampilkan data setelah perubahan
        System.out.println("Model baru : " + mobil.getModel());
        System.out.println("Tahun baru : " + mobil.getTahun());
    }
}
