/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.luckyseven1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author merin
 */
public class LuckySeven {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int currentValue = 0;
        int diceTotal = 0;
        int totalRolls = 0;
        int maxMoneyRoll = 0;
        //asks the user how many dollars they have to bet
        System.out.println("How many dollars do you have?");
        currentValue = myScanner.nextInt();
        myScanner.nextLine();
        int maxMoney = currentValue;

        //rolls the dice repeatedly until all the money is gone
        while (currentValue > 0) {
            diceTotal = RollDice() + RollDice();
            //how many rolls were taken before the money ran out.

            totalRolls++;
            //sum of rolls=7 wins 4

            if (diceTotal == 7) {
                currentValue += 4;
                //maximum amount of money held by the player.
                if (currentValue > maxMoney) {
                    maxMoney = currentValue;
                    //how many rolls were taken at the point when the user held the most money.
                    maxMoneyRoll = totalRolls;
                }
                //else loose 1

            } else {
                currentValue -= 1;
            }

        }
        System.out.println("How many dollars do you have?");
        System.out.println("You are broke after " + totalRolls);
        System.out.println("You should have quit after " + maxMoneyRoll + " rolls when you had $ " + maxMoney);
    }

    public static int RollDice() {
        Random rng = new Random();
        return rng.nextInt(6) + 1;
    }
    /* public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int currentAmount = 0;
        int totalRolls = 0;
        int maxMoneyRoll = 0;
        //ask user how many dollars they have to bet
        System.out.println("How many dollars do you have?");
        currentAmount = myScanner.nextInt();
        myScanner.nextLine();
    
        int maxAmount = currentAmount;
        while (currentAmount > 0) {

            //roll dice until money is gone
            int DiceTotal = RollDice() + RollDice();
            totalRolls++;

            //how many rolls until money ran out
            if (DiceTotal == 7) {
                currentAmount += 4;
                //max amount held by the player

                if (currentAmount > maxAmount) {
                    maxAmount = currentAmount;
                    //roll where user hold max money
                    maxMoneyRoll = totalRolls;
                }
            } else {
                currentAmount -= 1;
            }
        }
        System.out.println("You are broke after " + totalRolls);
        System.out.println("You should have quit after " + maxMoneyRoll + " when you had " + maxAmount);
    }

    public static int RollDice() {
        Random rng = new Random();
        return rng.nextInt(6) + 1;
    }*/
}
