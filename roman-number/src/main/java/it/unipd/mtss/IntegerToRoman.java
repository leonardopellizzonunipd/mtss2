////////////////////////////////////////////////////////////////////
// Leonardo Pellizzon 2111006
// Andrea Difino 2101072
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    // Converte un numero in numeri Romani
    public static String convert(int number) {

        // Controllo sull'input
        if (number > 1000 || number < 1) {
            throw new IllegalArgumentException("Il numero non è compreso tra 0 e 1001");
        }

        // Inizializzazione valori e corrispondenti numeri romani
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", 
        "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        // Popolamento della stringa e ritorno
        for (int j = 0; j < values.length; j++) {
            while (number >= values[j]) {
                number -= values[j];
                result.append(romanNumbers[j]);
            }
        }
        return result.toString();
    }
}