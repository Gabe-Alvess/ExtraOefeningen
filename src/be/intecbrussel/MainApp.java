package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Extra Oefeningen");
        System.out.println("---- Oefening 1 ----");

        int bruto =  50000;

        int belasting = 0;
        int result = 0;

        if (bruto > 3000) {
             belasting = bruto / 100 * 38;
             result = bruto - belasting;
            System.out.println("Neto = " + result);
        } else if (bruto >= 2000 && bruto <= 3000 ) {
            belasting = bruto / 100 * 35;
            result = bruto - belasting;
            System.out.println("Neto = " + result);
        } else if (bruto < 2000) {
            belasting = bruto / 100 * 27;
            result = bruto - belasting;
            System.out.println("Neto = " + result);
        }

        System.out.println(" ---- oefening 2 ---- ");

    }
}
