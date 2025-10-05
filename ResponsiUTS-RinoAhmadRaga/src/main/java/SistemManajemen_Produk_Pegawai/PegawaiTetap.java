/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen_Produk_Pegawai;

/**
 *
 * @author rinoa
 */
public class PegawaiTetap extends Pegawai {
    private long tunjangan;
    
    public PegawaiTetap(String namaPegawai, long gaji, long tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    public long getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(long tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + this.tunjangan);
    }
}
