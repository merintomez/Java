/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.intrestcalculator;

import java.util.Scanner;

/**
 *
 * @author merin
 */
public class IntrestCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        float initialAmount = 0;
        int totalYears = 0;
        double intrestRate = 0;
        int year=0;
        // get input from user
        initialAmount = inputValue("How much do you want to invest?");
        System.out.println("How many years are investing?");
        totalYears=myScanner.nextInt();
        myScanner.nextLine();
        intrestRate = inputValue("What is the annual interest rate % growth?");

        System.out.println("Calculating...");
        //year number
        for (int i = 1; i <= totalYears; i++) {
            System.out.println("Year " + i);
            year++;
            //principal at the beginning of the year

        }
        //total amount of interest earned for the year
        //principal at the end of the year

        System.out.println("Began with ");
        System.out.println("Earned $ ");
        System.out.println("Ended with $ ");

    }

    public static float inputValue(String prompt) {
        // declare and initialize a Scanner variable
        Scanner myScanner = new Scanner(System.in);
        // print prompt to console
        System.out.println(prompt);
        // read value into String data type
        String input = myScanner.nextLine();
        // convert the String to a float
        float floatVal = Float.parseFloat(input);
        // return the float value
        return floatVal;

    }

}
