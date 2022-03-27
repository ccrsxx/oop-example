package encapsulation.single;

class Belajar {
    public String x = "Pintar";

    /*
     * private String y = "Belajar"; 
     * private: hanya bisa diakses di dalam class sendiri makanya
     * diganti ke public
     */

    public String y = "Java";
}


public class Single {
    public static void main(String args[]) {
        Belajar belajar = new Belajar();

        System.out.println("Panggil x: " + belajar.x);
        System.out.println("Panggil y: " + belajar.y);
    }
}
