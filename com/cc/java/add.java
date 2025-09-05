package com.cc.java;

public class add 
{

    public static void main(String[] args) {
        System.out.print("Zahl eins eingeben: ");
        String input1 = System.console() != null ? System.console().readLine() : new java.util.Scanner(System.in).nextLine();
        System.out.print("Zahl zwei eingeben: ");
        String input2 = System.console() != null ? System.console().readLine() : new java.util.Scanner(System.in).nextLine();
        int zahl1, zahl2;
        try {
            zahl1 = Integer.parseInt(input1);
            zahl2 = Integer.parseInt(input2);
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe!");
            return;
        }
        int summe = zahl1 + zahl2;
        System.out.println("Summe: " + summe);
    }
    
}


// Zahl eins = System.console().readLine();
// Zahl zwei = System.console().readLine();
// addiere beide Eingaben;
// System.out.println(print(summe));
