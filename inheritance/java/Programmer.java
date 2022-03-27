package inheritance.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmer extends Orang {
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
