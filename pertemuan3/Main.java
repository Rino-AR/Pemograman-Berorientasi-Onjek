/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Merah");

        mobil1.displayInfo();
        mobil2.displayInfo();

        mobil1.startEngine();
        mobil2.startEngine();

        mobil1.setWarna("Putih");
        mobil2.setWarna("Biru");

        System.out.println("\nSetelah perubahan warna:");
        mobil1.displayInfo();
        mobil2.displayInfo();
    }
}
