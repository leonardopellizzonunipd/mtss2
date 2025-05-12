////////////////////////////////////////////////////////////////////
// Leonardo Pellizzon 2111006
// Andrea Difino 2101072
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {

    @Test
    public void testPrint1() {
        assertEquals(
            " _____  \n"+
            "|_   _| \n"+
            "  | |   \n"+
            "  | |   \n"+
            " _| |_  \n"+
            "|_____| \n",
            RomanPrinter.print(1));
    }
    @Test
    public void testPrint2() {
        assertEquals(
            " _____   _____  \n"+
            "|_   _| |_   _| \n"+
            "  | |     | |   \n"+
            "  | |     | |   \n"+
            " _| |_   _| |_  \n"+
            "|_____| |_____| \n",
            RomanPrinter.print(2));
    }
    @Test
    public void testPrint3() {
        assertEquals(
            " _____   _____   _____  \n"+
            "|_   _| |_   _| |_   _| \n"+
            "  | |     | |     | |   \n"+
            "  | |     | |     | |   \n"+
            " _| |_   _| |_   _| |_  \n"+
            "|_____| |_____| |_____| \n",
            RomanPrinter.print(3));
    }
    @Test
    public void testPrint4() {
        assertEquals(
            " _____  __        __ \n"+
            "|_   _| \\ \\    / / \n"+
            "  | |    \\ \\  / /  \n"+
            "  | |     \\ \\/ /   \n"+
            " _| |_     \\   /    \n"+
            "|_____|     \\ /     \n", 
            RomanPrinter.print(4));
    }
    @Test
    public void testPrint5() {
       assertEquals(
            "__        __ \n"+      
            "\\ \\    / / \n"+
            " \\ \\  / /  \n"+
            "  \\ \\/ /   \n"+
            "   \\   /    \n"+
            "    \\ /     \n", 
            RomanPrinter.print(5));
    }
    @Test
    public void testPrint6() {
       assertEquals(
            "__        __  _____  \n"+
            "\\ \\    / / |_   _| \n"+
            " \\ \\  / /    | |   \n"+
            "  \\ \\/ /     | |   \n"+
            "   \\   /     _| |_  \n"+
            "    \\ /     |_____| \n", 
            RomanPrinter.print(6));
    }
    @Test
    public void testPrint7() {
        assertEquals(
            "__        __  _____   _____  \n"+
            "\\ \\    / / |_   _| |_   _| \n"+
            " \\ \\  / /    | |     | |   \n"+
            "  \\ \\/ /     | |     | |   \n"+
            "   \\   /     _| |_   _| |_  \n"+
            "    \\ /     |_____| |_____| \n", 
            RomanPrinter.print(7));
    }
    @Test
    public void testPrint8() {
        assertEquals(
            "__        __  _____   _____   _____  \n"+
            "\\ \\    / / |_   _| |_   _| |_   _| \n"+
            " \\ \\  / /    | |     | |     | |   \n"+
            "  \\ \\/ /     | |     | |     | |   \n"+
            "   \\   /     _| |_   _| |_   _| |_  \n"+
            "    \\ /     |_____| |_____| |_____| \n", 
            RomanPrinter.print(8));
    }
    @Test
    public void testPrint9() {
        assertEquals(
            " _____  __     __ \n"+
            "|_   _| \\ \\ / / \n"+
            "  | |    \\ V  /  \n"+
            "  | |     >   <   \n"+
            " _| |_   / .  \\  \n"+
            "|_____| /_/ \\_\\ \n",
            RomanPrinter.print(9));
    }
    @Test
    public void testPrint10() {
        assertEquals(
            "__     __ \n"+
            "\\ \\ / / \n"+
            " \\ V  /  \n"+
            "  >   <   \n"+
            " / .  \\  \n"+
            "/_/ \\_\\ \n",
            RomanPrinter.print(10));
    }
    @Test
    public void testPrint12() {
        assertEquals(
            "__     __  _____   _____  \n"+
            "\\ \\ / / |_   _| |_   _| \n"+
            " \\ V  /    | |     | |   \n"+
            "  >   <     | |     | |   \n"+
            " / .  \\   _| |_   _| |_  \n"+
            "/_/ \\_\\ |_____| |_____| \n",
            RomanPrinter.print(12));
    }
    @Test
    public void testPrint14() {
        assertEquals(
            "__     __  _____  __        __ \n"+
            "\\ \\ / / |_   _| \\ \\    / / \n"+
            " \\ V  /    | |    \\ \\  / /  \n"+
            "  >   <     | |     \\ \\/ /   \n"+
            " / .  \\   _| |_     \\   /    \n"+
            "/_/ \\_\\ |_____|     \\ /     \n",
            RomanPrinter.print(14));
    }
    @Test
    public void testPrint16() {
        assertEquals(
            "__     __ __        __  _____  \n"+
            "\\ \\ / / \\ \\    / / |_   _| \n"+
            " \\ V  /   \\ \\  / /    | |   \n"+
            "  >   <     \\ \\/ /     | |   \n"+
            " / .  \\     \\   /     _| |_  \n"+
            "/_/ \\_\\     \\ /     |_____| \n",
            RomanPrinter.print(16));
    }
    @Test
    public void testPrint18() {
        assertEquals(
            "__     __ __        __  _____   _____   _____  \n"+
            "\\ \\ / / \\ \\    / / |_   _| |_   _| |_   _| \n"+
            " \\ V  /   \\ \\  / /    | |     | |     | |   \n"+
            "  >   <     \\ \\/ /     | |     | |     | |   \n"+
            " / .  \\     \\   /     _| |_   _| |_   _| |_  \n"+
            "/_/ \\_\\     \\ /     |_____| |_____| |_____| \n",
            RomanPrinter.print(18));
    }
    @Test
    public void testPrint20() {
        assertEquals(
            "__     __ __     __ \n"+
            "\\ \\ / / \\ \\ / / \n"+
            " \\ V  /   \\ V  /  \n"+
            "  >   <     >   <   \n"+
            " / .  \\   / .  \\  \n"+
            "/_/ \\_\\ /_/ \\_\\ \n",
            RomanPrinter.print(20));
    }
    @Test
    public void testPrint25() {
        assertEquals(
            "__     __ __     __ __        __ \n"+
            "\\ \\ / / \\ \\ / / \\ \\    / / \n"+
            " \\ V  /   \\ V  /   \\ \\  / /  \n"+
            "  >   <     >   <     \\ \\/ /   \n"+
            " / .  \\   / .  \\     \\   /    \n"+
            "/_/ \\_\\ /_/ \\_\\     \\ /     \n",
            RomanPrinter.print(25));
    }
    @Test
    public void testPrint30() {
        assertEquals(
            "__     __ __     __ __     __ \n"+
            "\\ \\ / / \\ \\ / / \\ \\ / / \n"+
            " \\ V  /   \\ V  /   \\ V  /  \n"+
            "  >   <     >   <     >   <   \n"+
            " / .  \\   / .  \\   / .  \\  \n"+
            "/_/ \\_\\ /_/ \\_\\ /_/ \\_\\ \n",
            RomanPrinter.print(30));
    }
    @Test
    public void testPrint35() {
        assertEquals(
            "__     __ __     __ __     __ __        __ \n"+
            "\\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / / \n"+
            " \\ V  /   \\ V  /   \\ V  /   \\ \\  / /  \n"+
            "  >   <     >   <     >   <     \\ \\/ /   \n"+
            " / .  \\   / .  \\   / .  \\     \\   /    \n"+
            "/_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\ /     \n",
            RomanPrinter.print(35));
    }
    @Test
    public void testPrint40() {
        assertEquals(
            "__     __  _       \n"+
            "\\ \\ / / | |      \n"+
            " \\ V  /  | |      \n"+
            "  >   <   | |      \n"+
            " / .  \\  | |____  \n"+
            "/_/ \\_\\ |______| \n",
            RomanPrinter.print(40));
    }
    @Test
    public void testPrint45() {
        assertEquals(
            "__     __  _       __        __ \n"+
            "\\ \\ / / | |      \\ \\    / / \n"+
            " \\ V  /  | |       \\ \\  / /  \n"+
            "  >   <   | |        \\ \\/ /   \n"+
            " / .  \\  | |____     \\   /    \n"+
            "/_/ \\_\\ |______|     \\ /     \n",
            RomanPrinter.print(45));
    }
    @Test
    public void testPrint50() {
        assertEquals(
            " _       \n"+
            "| |      \n"+
            "| |      \n"+
            "| |      \n"+
            "| |____  \n"+
            "|______| \n",
            RomanPrinter.print(50));
    }
    @Test
    public void testPrint100() {
       assertEquals(
            "  _____   \n"+
            "/  ____|  \n"+
            "| |       \n"+
            "| |       \n"+
            "| |_____  \n"+
            "\\______| \n", 
            RomanPrinter.print(100));
    }
    @Test
    public void testPrint200() {
       assertEquals(
            "  _____     _____   \n"+
            "/  ____|  /  ____|  \n"+
            "| |       | |       \n"+
            "| |       | |       \n"+
            "| |_____  | |_____  \n"+
            "\\______| \\______| \n", 
            RomanPrinter.print(200));
    }
    @Test
    public void testPrint300() {
        assertEquals(
            "  _____     _____     _____   \n"+
            "/  ____|  /  ____|  /  ____|  \n"+
            "| |       | |       | |       \n"+
            "| |       | |       | |       \n"+
            "| |_____  | |_____  | |_____  \n"+
            "\\______| \\______| \\______| \n", 
            RomanPrinter.print(300));
    }
    @Test
    public void testPrint400() {
       assertEquals(
            "  _____    _____   \n"+
            "/  ____|  |  __ \\ \n"+
            "| |       | |  | | \n"+
            "| |       | |  | | \n"+
            "| |_____  | |__| | \n"+
            "\\______| |_____/  \n",
            RomanPrinter.print(400));
    }
    @Test
    public void testPrint500() {
       assertEquals(
            " _____   \n"+
            "|  __ \\ \n"+
            "| |  | | \n"+
            "| |  | | \n"+
            "| |__| | \n"+
            "|_____/  \n",
            RomanPrinter.print(500));
    }
    @Test
    public void testPrint600() {
       assertEquals(
            " _____     _____   \n"+
            "|  __ \\ /  ____|  \n"+
            "| |  | | | |       \n"+
            "| |  | | | |       \n"+
            "| |__| | | |_____  \n"+
            "|_____/  \\______| \n",
            RomanPrinter.print(600));
    }
    @Test
    public void testPrint700() {
       assertEquals(
            " _____     _____     _____   \n"+
            "|  __ \\ /  ____|  /  ____|  \n"+
            "| |  | | | |       | |       \n"+
            "| |  | | | |       | |       \n"+
            "| |__| | | |_____  | |_____  \n"+
            "|_____/  \\______| \\______| \n",
            RomanPrinter.print(700));
    }
    @Test
    public void testPrint800() {
       assertEquals(
            " _____     _____     _____     _____   \n"+
            "|  __ \\ /  ____|  /  ____|  /  ____|  \n"+
            "| |  | | | |       | |       | |       \n"+
            "| |  | | | |       | |       | |       \n"+
            "| |__| | | |_____  | |_____  | |_____  \n"+
            "|_____/  \\______| \\______| \\______| \n",
            RomanPrinter.print(800));
    }
    @Test
    public void testPrint900() {
       assertEquals(
            "  _____    __   __  \n"+
            "/  ____|  |  \\/  | \n"+
            "| |       | \\  / | \n"+
            "| |       | |\\/| | \n"+
            "| |_____  | |   | | \n"+
            "\\______| |_|   |_| \n", 
            RomanPrinter.print(900));
    }
    @Test
    public void testPrint1000() {
       assertEquals(
            " __   __  \n"+
            "|  \\/  | \n"+
            "| \\  / | \n"+
            "| |\\/| | \n"+
            "| |   | | \n"+
            "|_|   |_| \n", 
            RomanPrinter.print(1000));
    }
}