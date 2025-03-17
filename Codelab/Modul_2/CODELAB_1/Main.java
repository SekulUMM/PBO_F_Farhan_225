package Codelab.Modul_2.CODELAB_1;

class Hewan {
    String nama;
    String jenis;
    String suara;

    // Constructor untuk langsung mengisi atribut
    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan langsung dengan constructor
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}

