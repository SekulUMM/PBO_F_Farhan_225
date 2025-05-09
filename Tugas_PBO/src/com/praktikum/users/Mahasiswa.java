package Tugas_PBO.src.com.praktikum.users;

import Tugas_PBO.src.com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void displayAppMenu() {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1 -> reportItem();
                case 2 -> viewReportedItems();
                case 0 -> System.out.println("Logout berhasil.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void reportItem() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = sc.nextLine();

        System.out.print("Masukkan Deskripsi Barang: ");
        String deskripsi = sc.nextLine();

        System.out.print("Masukkan Lokasi Ditemukan/Hilang: ");
        String lokasi = sc.nextLine();

        System.out.println(">> Laporan berhasil dikirim! <<");
        System.out.println("- Barang: " + namaBarang);
        System.out.println("- Deskripsi: " + deskripsi);
        System.out.println("- Lokasi: " + lokasi);
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }
}

