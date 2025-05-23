package Tugas_PBO.src.com.praktikum.users;

import java.util.Scanner;
import Tugas_PBO.src.com.praktikum.main.LoginSystem;
import Tugas_PBO.src.com.praktikum.models.Item;
import java.util.InputMismatchException;

public class Admin extends User {
    private int id;

    public Admin(String username, String password, int id) {
        super(username, password);
        this.id = id;
    }

    @Override
    public boolean login(String u, String p) {
        return getUsername().equals(u) && getPassword().equals(p);
    }

    @Override
    public void displayAppMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Menu Admin =====");
            System.out.println("1. Lihat Semua Laporan");
            System.out.println("2. Tandai Barang Diambil");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            try {
                int pilihan = sc.nextInt(); sc.nextLine();
                switch (pilihan) {
                    case 1:
                        for (Item item : LoginSystem.reportedItems) {
                            System.out.println(item.getItemName() + " - " + item.getStatus());
                        }
                        break;
                    case 2:
                        int idx = 0;
                        for (Item item : LoginSystem.reportedItems) {
                            if (item.getStatus().equals("Reported")) {
                                System.out.println(idx + ". " + item.getItemName());
                            }
                            idx++;
                        }
                        System.out.print("Masukkan indeks barang: ");
                        int i = sc.nextInt(); sc.nextLine();
                        try {
                            Item selected = LoginSystem.reportedItems.get(i);
                            if (selected.getStatus().equals("Reported")) {
                                selected.setStatus("Claimed");
                                System.out.println("Barang telah ditandai sebagai diambil.");
                            } else {
                                System.out.println("Barang sudah diambil.");
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Indeks tidak valid.");
                        }
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka.");
                sc.nextLine();
            }
        }
    }
}

