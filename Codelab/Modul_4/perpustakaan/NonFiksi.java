package Codelab.Modul_4.perpustakaan;

public class NonFiksi extends Buku {
    public NonFiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Non-Fiksi:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

