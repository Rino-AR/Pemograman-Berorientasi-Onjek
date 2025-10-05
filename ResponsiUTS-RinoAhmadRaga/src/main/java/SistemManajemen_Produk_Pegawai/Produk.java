/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen_Produk_Pegawai;

/**
 *
 * @author rinoa
 */
public class Produk {
    private String namaProduk;
    private long harga;
    
    public Produk(String namaProduk, long harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public long harga() {
        return harga;
    }
    
    public void setharga(long harga) {
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Harga: " + this.harga);
    }
}
