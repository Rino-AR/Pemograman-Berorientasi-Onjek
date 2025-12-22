/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author rinoa
 */
public class Buku extends KoleksiPerpustakaan {
    private String penulis;

    public Buku(String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + id +
                ", Judul: " + judul +
                ", Penulis: " + penulis);
    }
}
