package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoeveel cursisten kunnen zich inschrijven: ");

        int maxCursisten = Integer.parseInt(scanner.nextLine());

        Cursus cursus = new Cursus(maxCursisten);

        boolean toevoegenIsGelukt = false;

        do{
            System.out.print("Geef naam van cursist: ");
            String naam = scanner.nextLine();

            toevoegenIsGelukt = cursus.schrijfCursistIn(naam);

        } while (toevoegenIsGelukt);

        System.out.println("Sorry, laatste cursist konden we niet toevoegen.");

        for (int i = 0; i < cursus.getAantalCursisten(); i++) {

            System.out.println(cursus.getCursist(i));

        }

    }
}
