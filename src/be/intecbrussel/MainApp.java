package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Extra Oefeningen");
        System.out.println("---- Oefening 1 ----");
        // 1. Schrijf een programma dat het brutoloon omrekent naar het nettoloon.
        // Het programma moet rekening houden met de belastingen die ervan afgehouden worden.
        //- Brutoloon groter dan 3000 euro = 38% belastingen.
        //- Brutoloon tussen 2000 en 3000 euro= 35% belastingen.
        //- Brutoloon kleiner dan 2000 euro= 27% belastingen.

        int brutoloon =  5000;

        int belasting = 0;
        int result = 0;

        if (brutoloon > 3000) {
             belasting = brutoloon / 100 * 38;
             result = brutoloon - belasting;
            System.out.println("Nettoloon = " + result + "€");
        } else if (brutoloon >= 2000 && brutoloon <= 3000 ) {
            belasting = brutoloon / 100 * 35;
            result = brutoloon - belasting;
            System.out.println("Nettoloon = " + result + "€");
        } else if (brutoloon < 2000) {
            belasting = brutoloon / 100 * 27;
            result = brutoloon - belasting;
            System.out.println("Nettoloon = " + result + "€");
        }

        System.out.println(" ---- oefening 2 ---- ");
        // 2. Schrijf een programma dat van een gegeven bedrag in euro (1 tot 500 euro) berekent
        // welke biljetten en stukken je nodig hebt om het bedrag uit te betalen en hoeveel van elk.
        double bedraag = 200;
        int biljetten  = 0;
        int stukken = 0;
        
        boolean evenGetal = bedraag % 2 == 0;
        boolean onevenGetal = bedraag % 2 != 0;

        if (bedraag >= 1 && bedraag <= 500 && evenGetal) {

        } else if (bedraag >= 1 && bedraag <= 500 && onevenGetal) {
            
        } else {
            System.out.println("Het bedrag kon niet worden berekend!");
            System.out.println("Het bedraag mag minimum 1€ en maximum 500€ zijn.");
        }

        System.out.println(" ---- oefening 3 ---- ");
        // 3. Schrijf een programma met 2 variabelen. Zorg dat je de basic calculaties (+, -, /, *, %) kunt uitvoeren.
        // Gebruik hiervoor een switch statement.

        int a = 65;
        int b = 10;
        int res = 0;

        String operators = "*";

        switch (operators) {
            case "+" -> {
                res = a + b;
                System.out.println(a + " + " + b + " = " + res);
            }
            case "-" -> {
                res = a - b;
                System.out.println(a + " - " + b + " = " + res);
            }
            case "/" -> {
                res = a / b;
                System.out.println(a + " / " + b + " = " + res);
            }
            case "*" -> {
                res = a * b;
                System.out.println(a + " * " + b + " = " + res);
            }
            case "%" -> {
                res = a % b;
                System.out.println(a + " % " + b + " = " + res);
            }
            default -> {
                System.out.println("Ongeldige operator!");
            }
        }

        System.out.println(" ---- oefening 4 ---- ");
        // 4. Maak een programma dat een geheel aantal seconden, bijvoorbeeld 5924, omrekent in uren, minuten en seconden.
        // Het resultaat: U:1 M:38 S:44.

    }
}
