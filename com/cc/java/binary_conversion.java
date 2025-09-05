package com.cc.java;

public class binary_conversion {

    public static void main(String[] args) {
        System.out.print("Zahl (0-15) eingeben: ");
        String input = System.console() != null ? System.console().readLine() : new java.util.Scanner(System.in).nextLine();
        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe!");
            return;
        }
        if (number < 0 || number > 15) {
            System.out.println("Bitte eine Zahl zwischen 0 und 15 eingeben!");
            return;
        }
        StringBuilder binary = new StringBuilder();
        int n = number;
        do {
            binary.insert(0, n % 2);
            n = n / 2;
        } while (n > 0);
        System.out.println("Binär: " + binary.toString());
    }
}


