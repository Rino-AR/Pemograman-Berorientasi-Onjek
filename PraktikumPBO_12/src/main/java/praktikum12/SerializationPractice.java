/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

import java.io.*;

/**
 *
 * @author rinoa
 */
class Produk implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;
    
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

public class SerializationPractice {
    public static void main(String[] args) {
        String filePath = "produk.ser";
        
        // Membuat objek Produk
        Produk produk = new Produk("Laptop", 15000000,10);
        
        // Menyimpan objek ke file (Serialisasi)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);
            System.out.println("Objek Produk berhasildisimpan ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saatmenyimpan objek.");
            e.printStackTrace();
        }
        
        // Membaca objek dari file (Deserialisasi)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Produk deserializedProduk = (Produk)ois.readObject();
            System.out.println("\nObjek Produk berhasildibaca dari file:");
            deserializedProduk.tampilkanInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saatmembaca objek.");
            e.printStackTrace();
        }
    }
}
