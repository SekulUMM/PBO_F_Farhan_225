package Tugas_PBO;

import java.util.Scanner;

public class Mahasiswa {
    private String nama = "Mochammad Farhan Hikmadi";
    private String nim = "202410370110225";

    public boolean login(Scanner scanner) {
        System.out.print("Masukkan Nama: ");
        String inputNama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String inputNim = scanner.nextLine();

        if (inputNama.equals(nama) && inputNim.equals(nim)) {
            System.out.println("Login Mahasiswa berhasil!");
            displayInfo();
            return true;
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
            return false;
        }
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

