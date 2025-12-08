/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas12;

/**
 *
 * @author rinoa
 */
import java.io.*;
import java.util.Scanner;

public class SistemPerpustakaan {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SER_FILE = "buku.ser";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== SISTEM MANAJEMEN BUKU ===");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Tampilkan Daftar Buku (Text File)");
            System.out.println("3. Tampilkan Daftar Buku (Serialized Object)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = 0;
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus angka!");
                continue;
            }

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    bacaDariTextFile();
                    break;
                case 3:
                    bacaDariSerialFile();
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku() {
        System.out.print("Masukkan Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Pengarang: ");
        String pengarang = scanner.nextLine();
        
        int tahun = 0;
        while (true) {
            try {
                System.out.print("Masukkan Tahun Terbit: ");
                tahun = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Tahun harus berupa angka!");
            }
        }

        Buku bukuBaru = new Buku(judul, pengarang, tahun);

        simpanKeText(bukuBaru);
        
        simpanKeSerial(bukuBaru);

        System.out.println("Buku berhasil disimpan ke kedua file!");
    }

    private static void simpanKeText(Buku buku) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE, true))) {
            writer.write(buku.toString());
            writer.newLine(); // Pindah baris untuk entri berikutnya
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke text file: " + e.getMessage());
        }
    }

    private static void bacaDariTextFile() {
        System.out.println("\n--- Isi File Buku.txt ---");
        File file = new File(TEXT_FILE);
        if (!file.exists()) {
            System.out.println("File buku.txt belum ada.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file text: " + e.getMessage());
        }
    }

    private static void simpanKeSerial(Buku buku) {
        File file = new File(SER_FILE);
        boolean append = file.exists(); // Cek apakah file sudah ada

        try (FileOutputStream fos = new FileOutputStream(file, true);
             ObjectOutputStream oos = append ? 
                 new AppendableObjectOutputStream(fos) : // Gunakan custom stream jika append
                 new ObjectOutputStream(fos)) {          // Gunakan standar jika file baru
            
            oos.writeObject(buku);
            
        } catch (IOException e) {
            System.out.println("Gagal melakukan serialisasi: " + e.getMessage());
        }
    }

    private static void bacaDariSerialFile() {
        System.out.println("\n--- Isi File Buku.ser (Deserialized) ---");
        File file = new File(SER_FILE);
        if (!file.exists()) {
            System.out.println("File buku.ser belum ada.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Buku buku = (Buku) ois.readObject();
                    System.out.println(buku);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error membaca file serial: " + e.getMessage());
        }
    }

    private static class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        @Override
        protected void writeStreamHeader() throws IOException {
            reset();
        }
    }
}
