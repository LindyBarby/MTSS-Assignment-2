package it.unipd.mtss;

import org.junit.Test;

import it.unipd.mtss.exceptions.IntegerToRomanException;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
  @Test
  public void TestConvertNegativeNumber() {
    try{
        IntegerToRoman.convert(-1);
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }
  @Test
  public void TestAsciiPrintNegativeNumber() {
    try{
        RomanPrinter.print(-1);
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestConvert3Number() {
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
  public void TestConvert6Number() {
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
  public void TestConvert10Number() {
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
  public void TestConvert20Number() {
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
  public void TestConvert50Number() {
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
  public void TestConvert100Number() {
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
  public void TestConvert500Number() {
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
  public void TestConvert1000Number() {
    try{
        for(int i=1; i<=1000; i++){
          System.out.println(IntegerToRoman.convert(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestAsciiPrint3Number() {
    try{
        for(int i=1; i<=3; i++){
          System.out.println(RomanPrinter.print(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestAsciiPrint6Number() {
    try{
        for(int i=1; i<=6; i++){
          System.out.println(RomanPrinter.print(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestAsciiPrint10Number() {
    try{
        for(int i=1; i<=10; i++){
          System.out.println(RomanPrinter.print(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestAsciiPrint20Number() {
    try{
        for(int i=1; i<=20; i++){
          System.out.println(RomanPrinter.print(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestAsciiPrint50Number() {
    try{
        for(int i=1; i<=50; i++){
          System.out.println(RomanPrinter.print(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestAsciiPrint100Number() {
    try{
        for(int i=1; i<=100; i++){
          System.out.println(RomanPrinter.print(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestAsciiPrint500Number() {
    try{
        for(int i=1; i<=500; i++){
          System.out.println(RomanPrinter.print(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }

  @Test
  public void TestAsciiPrint1000Number() {
    try{
        for(int i=1; i<=1000; i++){
          System.out.println(RomanPrinter.print(i));
        }
    }
    catch(IntegerToRomanException e){
        assertEquals("Invalid number to convert", e.getMessage());
    }
  }
}
