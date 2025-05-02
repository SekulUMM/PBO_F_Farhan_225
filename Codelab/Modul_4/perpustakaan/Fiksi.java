package Codelab.Modul_4.perpustakaan;

public class Fiksi extends Buku {
    public Fiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

