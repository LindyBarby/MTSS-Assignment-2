////////////////////////////////////////////////////////////////////
// Linda Barbiero 1220244
// Francesco Pinato 2013446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.TreeMap;

import it.unipd.mtss.exceptions.IntegerToRomanException;

public final class RomanPrinter {
    private RomanPrinter(){
        // Utility Class
    }
    private static TreeMap<Character, String[]> asciiArt
        = new TreeMap<Character, String[]>(); 
    static {
        asciiArt.put('I',new String[]{
            "  _____ ",
            " |_   _|",
            "   | |  ",
            "   | |  ",
            "  _| |_ ",
            " |_____|"
        });
        asciiArt.put('V',new String[]{
            " __      __",
            " \\ \\    / /",
            "  \\ \\  / / ",
            "   \\ \\/ /  ",
            "    \\  /   ",
            "     \\/    ",
        });
        asciiArt.put('X',new String[]{
            " __   __",
            " \\ \\ / /",
            "  \\ V / ",
            "   > <  ",
            "  / . \\ ",
            " /_/ \\_\\",
        });
        asciiArt.put('L',new String[]{
            "  _      ",
            " | |     ",
            " | |     ",
            " | |     ",
            " | |____ ",
            " |______|",
        });
        asciiArt.put('C',new String[] {
            "   _____ ",
            "  / ____|",
            " | |     ",
            " | |     ",
            " | |____ ",
            "  \\_____|",
        });
        asciiArt.put('M', new String[]{
            "  __  __ ",
            " |  \\/  |",
            " | \\  / |",
            " | |\\/| |",
            " | |  | |",
            " |_|  |_|",
        });
        asciiArt.put('D',new String[]{
            "  _____  ", 
            " |  __ \\ ",
            " | |  | |",
            " | |  | |",
            " | |__| |",
            " |_____/ ",
        });
    }
    
    public static String print(int num) throws IntegerToRomanException{
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        String asciiPrint = "";
        for(int i=0; i<6; i++){
            for(int j=0; j<romanNumber.length(); j++){
                asciiPrint = asciiPrint + 
                    asciiArt.get(romanNumber.charAt(j))[i];
            }
            asciiPrint = asciiPrint+"\n";
        }
        return asciiPrint;
    }
}
