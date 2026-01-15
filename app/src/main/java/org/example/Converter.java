package org.example;
import java.util.Scanner;
public class Converter {
    String toPounds(int num_oz){
        double value = (double) num_oz * 0.0625;
        if(value == 1) return String.format("%.4f",value) + " lb";
        return String.format("%.4f",value) + " lbs";
    }

    String toPoundsAndOunces(int num_oz){
        double value = (double) num_oz * 0.0625;
        int pounds = (int) value;
        int oz = (int) ((value - pounds) / 0.0625);

        if(pounds == 1)   return pounds + " lb " + oz + " oz";
        return pounds + " lbs " + oz + " oz";
    }

    boolean check_rules(String input){

        // check if the string is an empty space
        if(input.isEmpty() ||input.charAt(0) == ' '){
            System.out.println("Blank values are not allowed. Please enter the number of ounces.");
            return false;
        }

        // check if the string is a negative number
        if(input.charAt(0) == '-'){
            System.out.println("Your input should be a positive number. Please enter the number of ounces.");
            return false;
        }


        // check each char character for a non digit
        for(int i = 0; i < input.length(); i++ ){
            if(!Character.isDigit(input.charAt(i))){
                System.out.println("That is not a number! Please enter the number of ounces.");
                return false;
            }
        }
        return true;
    }

    void run_program(){
        var scan = new Scanner(System.in);
        System.out.println("Welcome to the Ounce Conversion Program!");

        System.out.print("How many ounces do you have? ");
        String num_oz = scan.nextLine();

        boolean check = check_rules(num_oz);
        while(!check){
            System.out.print("How many ounces do you have? ");
            num_oz = scan.nextLine();
            check = check_rules(num_oz);
        }

        System.out.println("Thank you! Converting ounces to pounds.");
        int int_oz = Integer.parseInt(num_oz);
        System.out.println(num_oz + " oz is equivalent to " + toPoundsAndOunces(int_oz) + ".");
        System.out.println(num_oz + " oz is equivalent to " + toPounds(int_oz) + ".");
        System.out.println("Thank you for using the OCP!");
    }

}

