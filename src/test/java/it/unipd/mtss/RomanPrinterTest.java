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
  @Test
  public void testAsciiPrint3Number() {
    try{
        for(int i=1; i<=3; i++){
          RomanPrinter.print(i);
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void testConvert3Number() {
    try{
        for(int i=1; i<=3; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void testConvert6Number() {
    try{
        for(int i=1; i<=6; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void testConvert10Number() {
    try{
        for(int i=1; i<=10; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void testConvert20Number() {
    try{
        for(int i=1; i<=20; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void testConvert50Number() {
    try{
        for(int i=1; i<=50; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void testConvert100Number() {
    try{
        for(int i=1; i<=100; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void testConvert500Number() {
    try{
        for(int i=1; i<=500; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void testConvert1000Number() {
    try{
        for(int i=1; i<=1000; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }
}
