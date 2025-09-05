package com.cc.java;

public class gerade_ungerade 
{

    public static void main(String[] args) {
        System.out.print("Zahl eingeben: ");
        String input = System.console() != null ? System.console().readLine() : new java.util.Scanner(System.in).nextLine();
        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe!");
            return;
        }
        if (number % 2 == 0) {
            System.out.println("Diese Zahl ist gerade");
        } else {
            System.out.println("Diese Zahl ist ungerade");
        }
    }
    
}


// Zahl # eingeben = System.console().readLine();
// if (Modulo von # = 0?)
// {
//     System.out.println(Diese Zahl ist gerade);
// } else {
//     System.out.println(Diese Zahl ist ungerade);
// }