////////////////////////////////////////////////////////////////////
// Leonardo Pellizzon 2111006
// Andrea Difino 2101072
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    // Converte un numero in numeri Romani
    public static String convert(int number) {
        // Controllo sull'input
        if (number > 3 || number < 1) {
            throw new IllegalArgumentException("Il numero non è compreso tra 0 e 4");
        }

        // Inizializzazione valori e corrispondenti numeri romani
        int[] values = {1};
        String[] romanNumbers = {"I"};
        
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