package Codelab.Modul_2.CODELAB_2;

public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("202410370110225", "Farhan", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110264", "Azril", 1000000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        rekening1.tarikUang(800000);
        rekening2.tarikUang(300000);

        System.out.println();
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}

