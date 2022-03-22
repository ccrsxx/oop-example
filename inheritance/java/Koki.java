package inheritance.java;

import java.util.Arrays;
import java.util.List;

public class Koki extends Orang {
    List<String> dishes = Arrays.asList("Nasi Goreng", "Sate", "Soto");

    public Koki(String name, int age) {
        super(name, age);
    }

    void masak() {
        System.out.println("Class ini bisa masak");
    }

    void keluarinMenu() {
        for (int i = 0; i < dishes.size(); i++) {
            System.out.println("Menu yang dikuasai: " + dishes.get(i));
        }
    }
}
