/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author rinoa
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Buku> daftarBuku = new ArrayList<>();
        Perpustakaan perpustakaan = new Perpustakaan();
        TransaksiPeminjaman transaksi = null;

        int pilihan;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Daftar Buku");
            System.out.println("6. Simpan Data Anggota");
            System.out.println("7. Tampilkan Daftar Anggota");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Input harus angka!");
                input.nextLine();
                pilihan = -1;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Nama anggota: ");
                    Anggota anggota = new Anggota(input.nextLine());
                    perpustakaan.tambahAnggota(anggota);
                    transaksi = new TransaksiPeminjaman(anggota);
                    System.out.println("Anggota berhasil ditambahkan.");
                    break;

                case 2:
                    String id;
                    while (true) {
                        System.out.print("ID Buku: ");
                        id = input.nextLine();

                        try {
                            Integer.parseInt(id); // validasi angka
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("ERROR: ID buku harus berupa angka!");
                        }
                    }

                    System.out.print("Judul Buku: ");
                    String judul = input.nextLine();

                    System.out.print("Penulis: ");
                    String penulis = input.nextLine();

                    daftarBuku.add(new Buku(id, judul, penulis));
                    System.out.println("Buku berhasil ditambahkan.");
                    break;

                case 3:
                    if (transaksi == null || daftarBuku.isEmpty()) {
                        System.out.println("Data belum lengkap.");
                        break;
                    }
                    tampilkanBuku(daftarBuku);
                    System.out.print("Pilih nomor buku: ");
                    transaksi.pinjamBuku(daftarBuku.get(input.nextInt() - 1));
                    input.nextLine();
                    break;

                case 4:
                    if (transaksi == null || transaksi.getBukuDipinjam().isEmpty()) {
                        System.out.println("Tidak ada buku dipinjam.");
                        break;
                    }
                    tampilkanBuku(transaksi.getBukuDipinjam());
                    System.out.print("Pilih nomor buku: ");
                    transaksi.kembalikanBuku(
                            transaksi.getBukuDipinjam().get(input.nextInt() - 1));
                    input.nextLine();
                    break;

                case 5:
                    tampilkanBuku(daftarBuku);
                    break;

                case 6:
                    perpustakaan.simpanData("anggota.ser");
                    break;

                case 7:
                    perpustakaan.tampilkanAnggota();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);

        input.close();
    }

    private static void tampilkanBuku(List<Buku> buku) {
        for (int i = 0; i < buku.size(); i++) {
            System.out.print((i + 1) + ". ");
            buku.get(i).tampilkanInfo();
        }
    }
}
