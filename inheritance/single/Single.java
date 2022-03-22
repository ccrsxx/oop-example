package inheritance.single;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Orang {
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


class Programmer extends Orang {
    // khusus programmer
    ArrayList<String> bahasa =
            new ArrayList<String>(Arrays.asList("Python", "JavaScript", "TypeScript"));

    // constructor
    public Programmer(String name, int age) {
        super(name, age);
    }

    // khusus programmer
    void coding() {
        System.out.println("Class ini bisa coding");
    }

    void tambahBahasa(String bahasaBaru) {
        bahasa.add(bahasaBaru);
        System.out.println("Bahasa baru: " + bahasaBaru);
    }

    void keluarinSkill() {
        System.out.println("Bahasa yang dikuasai: " + String.join(", ", bahasa));
    }
}


class Koki extends Orang {
    List<String> dishes = Arrays.asList("Nasi Goreng", "Sate", "Soto");

    public Koki(String name, int age) {
        super(name, age);
    }

    void masak() {
        System.out.println("Class ini bisa masak");
    }

    void keluarinMenu() {
        System.out.println("Menut yang dikuasai: " + String.join(", ", dishes));
    }
}



public class Single {

    public static void main(String[] args) {
        // Class Orang
        System.out.println("Class Orang:\n");

        Orang normal = new Orang("Subaru", 17);

        normal.makan();
        normal.tidur();
        normal.keluarinNama();

        normal.gantiNama("Rudeus");

        normal.keluarinNama();

        System.out.println("\n");

        /*
         * orang.coding() orang.masak() dua metode ini tidak bisa diakses karena Orang adalah Parent
         * class
         */

        // Class Programmer
        System.out.println("Class Programmer:\n");

        Programmer programmer = new Programmer("Risal", 19);

        /*
         * note: ini class Progammer, tapi kita bisa pakai semua method dari Orang class karena kita
         * inherit (extends) dari class Orang
         */

        programmer.coding();
        programmer.makan();

        // method khusus yang ada di class Programmer
        programmer.tambahBahasa("Java");
        programmer.keluarinSkill();

        System.out.println("\n");

        // Class Koki
        System.out.println("Class Koki:\n");

        Koki koki = new Koki("Emilia", 18);

        // bisa tidur karena inherit dari class Orang
        koki.masak();
        koki.tidur();

        // method khusus yang ada di class Koki
        koki.keluarinMenu();
    }
}
