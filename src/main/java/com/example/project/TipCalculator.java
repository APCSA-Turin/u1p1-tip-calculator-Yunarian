package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

    // The rounding being used is the hacky rounding using in casting showcased on the slides
    // The program SHOULD only be working with positive numbers, so this should work fine.
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n" ); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");

        double tipTotal = (int)(cost * percent + 0.5) / 100.0;
        result.append("Total tip: $" + tipTotal + "\n");
        result.append("Total Bill with tip: $" + (cost + tipTotal) + "\n");

        double costPerPerson = (int)(cost * 100.0 / people + 0.5)/100.0;
        result.append("Per person cost before tip: $" + costPerPerson +"\n");

        double tipPerPerson = (int)((cost * 100.0 / people)/100.0 * percent + 0.5) / 100.0;
        result.append("Tip per person: $" + tipPerPerson + "\n");
        // Testing
        double costPerPersonTotal = (int)((((cost * 100.0 / people )/100.0 * percent / 100.0) + (cost / people)) * 100 + 0.5) / 100.0;
        System.out.println( );

        result.append("Total cost per person: $" + costPerPersonTotal + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;     
        System.out.println(calculateTip(people, percent, cost));
    }
}
        
