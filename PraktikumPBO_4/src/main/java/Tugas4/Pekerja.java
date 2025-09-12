/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author rinoa
 */
public class Pekerja extends Manusia {
    private double gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    //Getter & Setter
    public double getGaji() {
        return this.gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    @Override
    public String toString() {
         return "Informasi Pekerja:\n" +
                 "  Nama      : " + getNama() + "\n" +
                 "  Usia      : " + this.usia + " tahun\n" +
                 "  Pekerjaan : " + this.pekerjaan + "\n" +
                 "  Gaji: Rp" + String.format("%,.2f", gaji);
    }
}
