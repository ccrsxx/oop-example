package polymorphism.java;

class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara: ...");
    }
}


class Kucing extends Hewan {
    void bersuara() {
        System.out.println("Kucing bersuara: meong meong");
    }
}


class Anjing extends Hewan {
    void bersuara() {
        System.out.println("Anjing bersuara: guk guk");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.bersuara();

        Kucing kucing = new Kucing();
        kucing.bersuara();

        Anjing anjing = new Anjing();
        anjing.bersuara();
    }
}
