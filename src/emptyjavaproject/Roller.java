/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emptyjavaproject;

import java.util.Scanner;

/**
 *
 * @author mercy.daniels
 */
public class Roller {
     //asks questions, i was goning to calculate percentage here but i got very confused and did not
    public void startRolling() {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of Sides?");
        int sideNumber = input.nextInt();
        Dice die = new Dice(sideNumber);

        System.out.println("Number of Prints?");
        int howManyRolls = input.nextInt();
       
        System.out.println("Number of Die?");
        int howManyDie = input.nextInt();
        if (howManyDie > 2 || howManyDie < 1) {
            System.out.println("One or two dice. try again");
            howManyDie = input.nextInt();
        }

        Counter counter = new Counter(die);
        for (int i = 0; i < howManyRolls * howManyDie; i++) {
            int roll = die.roll();
            counter.add(roll);

        }

        counter.printResults();
    }
}
