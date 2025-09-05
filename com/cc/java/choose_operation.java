package com.cc.java;

public class choose_operation {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Zahl eins eingeben: ");
        float zahl1;
        try {
            zahl1 = Float.parseFloat(System.console() != null ? System.console().readLine() : scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe!");
            return;
        }
        System.out.print("Zahl zwei eingeben: ");
        float zahl2;
        try {
            zahl2 = Float.parseFloat(System.console() != null ? System.console().readLine() : scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe!");
            return;
        }
        System.out.print("Operation wählen (Addieren, Subtrahieren, Multiplizieren, Dividieren): ");
        String operation = System.console() != null ? System.console().readLine() : scanner.nextLine();
        switch (operation) {
            case "Addieren":
                System.out.println("Ergebnis: " + (zahl1 + zahl2));
                break;
            case "Subtrahieren":
                System.out.println("Ergebnis: " + (zahl1 - zahl2));
                break;
            case "Multiplizieren":
                System.out.println("Ergebnis: " + (zahl1 * zahl2));
                break;
            case "Dividieren":
                if (zahl2 == 0.0f) {
                    System.out.println("Division durch 0 nicht möglich!");
                } else {
                    System.out.println("Ergebnis: " + (zahl1 / zahl2));
                }
                break;
            default:
                System.out.println("Unbekannte Operation!");
        }
    }
}

// Zahl eins = System.console().readLine();
// Zahl zwei = System.console().readLine();
// switch (Operation?)
// {
//     case Addieren:
//         System.out.println(Zahl eins + Zahl zwei);
//         break;
//     case Subtrahieren:
//         System.out.println(Zahl eins - Zahl zwei);
//         break;
//     case Multiplizieren:
//         System.out.println(Zahl eins * Zahl zwei);
//         break;
//     case Dividieren:
//         System.out.println(Zahl eins / Zahl zwei);
//         break;
// }
