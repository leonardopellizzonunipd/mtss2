////////////////////////////////////////////////////////////////////
// Leonardo Pellizzon 2111006
// Andrea Difino 2101072
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();

        // Inizializzazione lettere in ascii art
        String[][] asciiArtLetters = {
            {
                " __   __  ", // M
                " _____   ",  // D 
                "  _____   ",  // C 
                " _       ",  // L 
                "__     __ ",  // X
                "__        __ ", //V
                " _____  ", // I 
            },

            {
                "|  \\/  | ", // M
                "|  __ \\ ",  // D
                "/  ____|  ",  // C
                "| |      ",  // L
                "\\ \\ / / ",  // X
                "\\ \\    / / ", // V
                "|_   _| ", // I
            },

            {
                "| \\  / | ", // M
                "| |  | | ",  // D
                "| |       ",  // C
                "| |      ",  // L
                " \\ V  /  ",  // X
                " \\ \\  / /  ", //V
                "  | |   " // I
            },

            {
                "| |\\/| | ", // M
                "| |  | | ", // D
                "| |       ", // C
                "| |      ", // L
                "  >   <   ", // X
                "  \\ \\/ /   ", // V
                "  | |   " // I
            },

            {
                "| |   | | ", // M
                "| |__| | ", // D
                "| |_____  ", // C
                "| |____  ", // L
                " / .  \\  ", // X
                "   \\   /    ", // V
                " _| |_  " // I
            },

            {
                "|_|   |_| ", // M
                "|_____/  ", // D
                "\\______| ", // C
                "|______| ", // L
                "/_/ \\_\\ ", // X
                "    \\ /     ", // V
                "|_____| " // I
            },
        };

        // Ciclo for che scrive ogni numero una riga per volta
        for(int j=0; j<6; j++) {
            // scrive da destra a sinistra i pezzi di numeri romani
            for (char c : romanNumber.toCharArray()) {
                result.append(asciiArtLetters[j]["MDCLXVI".indexOf(c)]);
            }
            result.append("\n");
        }
        return result.toString();
    }
}