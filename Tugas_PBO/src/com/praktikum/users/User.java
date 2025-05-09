package Tugas_PBO.src.com.praktikum.users;

public abstract class User {
    protected String username;  // Untuk Admin
    protected String password;  // Untuk Admin
    private String nama;        // Untuk Mahasiswa
    private String nim;         // Untuk Mahasiswa

    // Konstruktor untuk Mahasiswa
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Konstruktor untuk Admin (pakai username & password)
    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
    }

    // Getter dan Setter Mahasiswa
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Abstract methods
    public abstract boolean login(String input1, String input2);
    public abstract void displayAppMenu();

    // Method umum
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

