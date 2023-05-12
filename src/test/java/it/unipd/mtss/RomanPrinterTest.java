package it.unipd.mtss;

import org.junit.Test;

import it.unipd.mtss.exceptions.IntegerToRomanException;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
  @Test
  public void testConvertNegativeNumber() {
    try{
        IntegerToRoman.convert(-1);
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }
  @Test
  public void testAsciiPrintNegativeNumber() {
    try{
        RomanPrinter.print(-1);
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }
}
