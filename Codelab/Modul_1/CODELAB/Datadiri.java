package Codelab.Modul_1.CODELAB;

import java.util.Scanner;
import java.time.LocalDate;

public class Datadiri {
    public static void main(String[] args) {
        // Object scanner
        Scanner scanner = new Scanner(System.in);

        // Input
        // Nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jk = scanner.next().toUpperCase();

        // Tahun kelahiran
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup inputW
        scanner.close();

        // Menghitung umur
        int umur = LocalDate.now().getYear() - tahunLahir;

        // Penentuan jenis kelamin
        String jenisKelamin = jk.equals("P") ? "Perempuan" : "Laki-laki";

        // Hasil output yang keluar
        System.out.println("\nData Diri:");
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Umur            : " + umur + " tahun");
    }
}

