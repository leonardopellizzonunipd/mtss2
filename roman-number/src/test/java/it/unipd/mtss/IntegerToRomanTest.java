////////////////////////////////////////////////////////////////////
// Leonardo Pellizzon 2111006
// Andrea Difino 2101072
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {
    @Test
    public void testConvert() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XII", IntegerToRoman.convert(12));
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XVI", IntegerToRoman.convert(16));
        assertEquals("XVIII", IntegerToRoman.convert(18));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XXV", IntegerToRoman.convert(25));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XXXV", IntegerToRoman.convert(35));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLV", IntegerToRoman.convert(45));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("LX", IntegerToRoman.convert(60));
        assertEquals("LXX", IntegerToRoman.convert(70));
        assertEquals("LXXX", IntegerToRoman.convert(80));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("CC", IntegerToRoman.convert(200));
        assertEquals("CCC", IntegerToRoman.convert(300));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("DC", IntegerToRoman.convert(600));
        assertEquals("DCC", IntegerToRoman.convert(700));
        assertEquals("DCCC", IntegerToRoman.convert(800));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("M", IntegerToRoman.convert(1000));
    }
    @Test
    public void testIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(1001));
    }
}