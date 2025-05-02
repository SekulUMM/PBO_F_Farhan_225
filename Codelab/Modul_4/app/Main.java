import Codelab.Modul_4.perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu");

        buku1.displayInfo();
        System.out.println();

        buku2.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Farhan", "225");
        Anggota anggota2 = new Anggota("Bimo", "234");

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}

