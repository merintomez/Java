/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author merin
 */
public class DogGenetics {
     public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRandomizer = new Random();

        String dogName= "none";

        String[] dogBreeds ={
            "St. Bernard" ,
            "Chihuahua",
            "Dramatic RedNosed Asian Pug",
            "Common Cur",
            "King Doberman"
        };

        int a = myRandomizer.nextInt(101);
        int b = myRandomizer.nextInt(101-a);
        int c = myRandomizer.nextInt(101-a-b);
        int d = myRandomizer.nextInt(101-a-b-c);
        int e = 100-a-b-c-d;

        int[] randomPercentages = {a, b, c, d, e};

        System.out.println("What is your dog name?");
        dogName = myScanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on " +dogName +"\'s prestigious background right here.\n" +dogName +" is:\n");

        for (int i=0; i<5;i++){
            System.out.println(randomPercentages[i]+ "%" +dogBreeds[i]); 
        }

    }

}