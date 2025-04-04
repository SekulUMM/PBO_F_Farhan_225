package Tugas_PBO;

import java.util.Scanner;

public class Login {
    private Scanner scanner;
    private Admin admin;
    private Mahasiswa mahasiswa;

    public Login() {
        scanner = new Scanner(System.in);
        admin = new Admin();
        mahasiswa = new Mahasiswa();
    }

    public void start() {
        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        boolean sukses = false;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username: ");
                String user = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String pass = scanner.nextLine();
                sukses = admin.login(user, pass);
                if (sukses) admin.displayInfo();
                else System.out.println("Login Admin gagal!");
                break;
            case 2:
                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();
                sukses = mahasiswa.login(nama, nim);
                if (sukses) mahasiswa.displayInfo();
                else System.out.println("Login Mahasiswa gagal!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

