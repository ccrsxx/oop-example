package inheritance.java;

public class Orang {
    // iniasiasi variable
    String nama;
    int umur;

    // constructor
    public Orang(String name, int age) {
        nama = name;
        umur = age;
    }

    // method
    void keluarinNama() {
        System.out.println("Nama: " + nama);
    }

    void keluarinUmur() {
        System.out.println("Umur: " + umur);
    }

    void gantiNama(String name) {
        nama = name;
        System.out.println("Nama baru: " + nama);
    }

    void gantiUmur(int age) {
        umur = age;
        System.out.println("Umur baru: " + umur);
    }

    void makan() {
        System.out.println("Class ini bisa makan");
    }

    void tidur() {
        System.out.println("Class ini bisa tidur");
    }
}
