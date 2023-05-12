////////////////////////////////////////////////////////////////////
// Linda Barbiero 1220244
// Francesco Pinato 2013446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import it.unipd.mtss.exceptions.IntegerToRomanException;

public final class RomanPrinter {
    private RomanPrinter(){
        // Utility Class
    }
    public static String print(int num) throws IntegerToRomanException{
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        //TODO
        return null;
    }
}
