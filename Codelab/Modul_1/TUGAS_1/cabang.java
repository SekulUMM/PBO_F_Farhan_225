//tujuan file
package Codelab.Modul_1.TUGAS_1;

//fungsi
import java.util.Scanner;

//class name percabangan
public class cabang {
    //menggunakan static void sebagai default
    public static void main (String[] args) {
        //membuat line untuk pengisian input
        Scanner scanner = new Scanner(System.in);

        //tampilan menu yang akan di pilih
        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        //menggunakan integer pilihan 1 dan juga 2
        int pilihan = scanner.nextInt();
        //menghilangkan buffer
        scanner.nextLine();

        //pilihan jika memilih "admin"
        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            //penentuan untuk login admin user
            if (username.startsWith("Admin225") && password.startsWith("Password225")) {
                String nimAkhir = username.substring(5);
                if (password.equals("Password" + nimAkhir)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

            //pilihan jika memilih "mahasiswa"
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            //penentuan untuk login mahasiswa user
            if (nama.equals("Mochammad Farhan Hikmadi") && nim.equals("202410370110225")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        //menutup scanner agar aman
        scanner.close();
    }
}

