package logic.java;

public class Main {
    public static void main(String[] args) {
        // initializing variables
        int a = 10, b = 1, c = 10, d = 30;

        // Displaying a, b, c
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // using logical OR to verify
        // two constraints
        if (a > b || c == d)
            System.out.println("One or both" + " the conditions are true");
        else
            System.out.println("Both the" + " conditions are false");

        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }
}
