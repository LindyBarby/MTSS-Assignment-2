////////////////////////////////////////////////////////////////////
// Linda Barbiero 1220244
// Francesco Pinato 2013446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import it.unipd.mtss.exceptions.IntegerToRomanException;

public final class IntegerToRoman {
    private IntegerToRoman(){
        // Utility Class
    }
    public static String convert(int number) throws IntegerToRomanException{
        if (number < 0 ) {
            throw new IntegerToRomanException("Invalid number to convert");
        }
        // TODO
        return null;
    }
}
