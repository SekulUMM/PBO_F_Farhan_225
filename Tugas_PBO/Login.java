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
        scanner.nextLine(); // Menghilangkan buffer

        if (pilihan == 1) {
            admin.login(scanner);
        } else if (pilihan == 2) {
            mahasiswa.login(scanner);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

