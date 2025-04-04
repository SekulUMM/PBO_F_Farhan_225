package Tugas_PBO;

import java.util.Scanner;

public class Admin extends User {
    private String username = "Admin225";
    private String password = "Password225";

    public Admin() {
        super("Admin Default", "0000"); // Nama dan nim tidak digunakan untuk login admin
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Username: " + username);
    }
}

