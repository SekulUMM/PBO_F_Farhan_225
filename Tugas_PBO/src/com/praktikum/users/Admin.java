package Tugas_PBO.src.com.praktikum.users;

import Tugas_PBO.src.com.praktikum.actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions {

    public Admin(String username, String password, Number isAdmin) {
        super(username, password, isAdmin); // Login pakai data dari konstruktor
    }

    @Override
    public boolean login(String inputUser, String inputPass) {
        return username.equals(inputUser) && password.equals(inputPass);
    }

    @Override
    public void displayAppMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Menu Admin ===");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt();
            sc.nextLine(); // Konsumsi newline

            switch (choice) {
                case 1 -> manageItems();
                case 2 -> manageUsers();
                case 0 -> System.out.println("Logout berhasil.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }
}

