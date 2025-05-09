package Tugas_PBO.src.com.praktikum.main;

import Tugas_PBO.src.com.praktikum.users.Admin;
import Tugas_PBO.src.com.praktikum.users.Mahasiswa;
import Tugas_PBO.src.com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User currentUser = null;

        System.out.println("<< Sistem Login >>");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih nomor: ");
        int pilih = sc.nextInt();
        sc.nextLine(); // buang newline

        if (pilih == 1) {
            // Login Admin
            System.out.print("Masukkan Username: ");
            String username = sc.nextLine();
            System.out.print("Masukkan Password: ");
            String password = sc.nextLine();

            Admin admin = new Admin("Admin225", "Password225");
            if (admin.login(username, password)) {
                currentUser = admin;
            } else {
                System.out.println("Login Admin gagal.");
                return;
            }

        } else if (pilih == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();

            Mahasiswa mhs = new Mahasiswa("Mochammad Farhan Hikmadi", "202410370110225");
            if (mhs.login(nama, nim)) {
                currentUser = mhs;
            } else {
                System.out.println("Login Mahasiswa gagal.");
                return;
            }
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Menampilkan menu sesuai peran
        currentUser.displayAppMenu();
    }
}

