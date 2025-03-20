package Tugas_PBO;

import java.util.Scanner;

public class Admin {
    private String username = "Admin225";
    private String password = "Password225";

    public boolean login(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.startsWith(username) && inputPassword.startsWith(password)) {
            String nimAkhir = inputUsername.substring(5);
            if (inputPassword.equals("Password" + nimAkhir)) {
                System.out.println("Login Admin berhasil!");
                return true;
            } else {
                System.out.println("Login gagal! Username atau password salah.");
                return false;
            }
        } else {
            System.out.println("Login gagal! Username atau password salah.");
            return false;
        }
    }
}

