////////////////////////////////////////////////////////////////////
// Linda Barbiero 1220244
// Francesco Pinato 2013446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.TreeMap;

import it.unipd.mtss.exceptions.IntegerToRomanException;

public final class IntegerToRoman {
    private IntegerToRoman(){
        // Utility Class
    }
    private static TreeMap<Integer, String> romanMap 
        = new TreeMap<Integer, String>();

    static {
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

    }
    public static String convert(int number) throws IntegerToRomanException{
        if (number <= 0) {
            throw new IntegerToRomanException("Invalid number to convert");
        }
        int romanKey =  romanMap.floorKey(number);
        if ( number == romanKey ) {
            return romanMap.get(number);
        }
        return romanMap.get(romanKey) + convert(number-romanKey);
    }
}
