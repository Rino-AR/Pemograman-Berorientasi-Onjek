/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen_Produk_Pegawai;

/**
 *
 * @author rinoa
 */
public class Pegawai {
    private String namaPegawai;
    private long gaji;
    
    public Pegawai(String namaPegawai, long gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public long getgaji() {
        return gaji;
    }
    
    public void setgaji(long gaji){
        this.gaji = gaji;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + this.namaPegawai);
        System.out.println("Gaji: " + this.gaji);
    }
}
