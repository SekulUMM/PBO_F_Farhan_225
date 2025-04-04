package Tugas_PBO;

public class Mahasiswa extends User {

    public Mahasiswa() {
        super("Mochammad Farhan Hikmadi", "202410370110225");
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        super.displayInfo();
    }
}

