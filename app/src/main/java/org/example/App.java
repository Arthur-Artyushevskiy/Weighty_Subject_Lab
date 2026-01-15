package org.example;

public class App {

  public static void main(String[] args){
    var converter = new Converter();
    System.out.println(converter.toPounds(16));
    System.out.println(converter.toPoundsAndOunces(18));
    System.out.println(converter.toPoundsAndOunces(36));
    converter.run_program();
  }

}
