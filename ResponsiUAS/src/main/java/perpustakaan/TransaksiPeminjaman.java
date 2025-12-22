/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rinoa
 */
public class TransaksiPeminjaman implements Peminjaman, Serializable {
    private Anggota anggota;
    private List<Buku> bukuDipinjam = new ArrayList<>();

    public TransaksiPeminjaman(Anggota anggota) {
        this.anggota = anggota;
    }

    @Override
    public void pinjamBuku(Buku buku) {
        bukuDipinjam.add(buku);
        System.out.println(buku.judul + " berhasil dipinjam.");
    }

    @Override
    public void kembalikanBuku(Buku buku) {
        if (bukuDipinjam.remove(buku)) {
            System.out.println(buku.judul + " berhasil dikembalikan.");
        } else {
            System.out.println("Buku tidak ditemukan dalam daftar pinjaman.");
        }
    }

    public List<Buku> getBukuDipinjam() {
        return bukuDipinjam;
    }
}
