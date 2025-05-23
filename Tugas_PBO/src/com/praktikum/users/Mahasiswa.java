package Tugas_PBO.src.com.praktikum.users;

import Tugas_PBO.src.com.praktikum.actions.MahasiswaActions;
import Tugas_PBO.src.com.praktikum.main.LoginSystem;
import Tugas_PBO.src.com.praktikum.models.Item;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama, nim); // username = nama, password = nim
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(this.nama) && inputNim.equals(this.nim);
    }

    @Override
    public void displayAppMenu() {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");

            try {
                pilihan = sc.nextInt();
                sc.nextLine(); // konsumsi newline

                switch (pilihan) {
                    case 1 -> reportItem();
                    case 2 -> viewReportedItems();
                    case 0 -> System.out.println("Logout berhasil.");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                sc.nextLine(); // clear buffer
                pilihan = -1;
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

        Item item = new Item(namaBarang, deskripsi, lokasi);
        LoginSystem.reportedItems.add(item);

        System.out.println(">> Laporan berhasil dikirim! <<");
    }

    @Override
    public void viewReportedItems() {
        System.out.println("\n=== Daftar Laporan Barang ===");

        boolean found = false;
        for (Item item : LoginSystem.reportedItems) {
            if (item.getStatus().equals("Reported")) {
                System.out.println("- Barang: " + item.getItemName());
                System.out.println("  Deskripsi: " + item.getDescription());
                System.out.println("  Lokasi: " + item.getLocation());
                System.out.println("  Status: " + item.getStatus());
                System.out.println("--------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Belum ada laporan barang.");
        }
    }
}

