package Tugas_PBO.src.com.praktikum.main;

import Tugas_PBO.src.com.praktikum.users.*;
import Tugas_PBO.src.com.praktikum.models.Item;

import java.util.*;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi user
        userList.add(new Admin("Admin225", "Password225", 1));
        userList.add(new Mahasiswa("Mochammad Farhan Hikmadi", "202410370110225"));

        while (true) {
            System.out.println("\n<< Sistem Login >>");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.print("Pilih nomor: ");

            int pilih;
            try {
                pilih = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                sc.nextLine();
                continue;
            }

            User currentUser = null;

            if (pilih == 1) {
                System.out.print("Masukkan Username: ");
                String username = sc.nextLine();
                System.out.print("Masukkan Password: ");
                String password = sc.nextLine();

                for (User user : userList) {
                    if (user instanceof Admin && user.login(username, password)) {
                        currentUser = user;
                        break;
                    }
                }
            } else if (pilih == 2) {
                System.out.print("Masukkan Nama: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = sc.nextLine();

                for (User user : userList) {
                    if (user instanceof Mahasiswa && user.login(nama, nim)) {
                        currentUser = user;
                        break;
                    }
                }
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            if (currentUser != null) {
                currentUser.displayAppMenu();
            } else {
                System.out.println("Login gagal. Coba lagi.");
            }
        }
    }
}

