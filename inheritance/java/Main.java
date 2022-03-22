package inheritance.java;

public class Main {
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
