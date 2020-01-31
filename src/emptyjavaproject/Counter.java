/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author mercy.daniels
 */
public class Counter {
      int bigFace;
    int[] faceCounter;
    int numRolls;

    public Counter(Dice die) {
        bigFace = die.getFaces();
        faceCounter = new int[bigFace];
        numRolls = 0;
    }
// adds how many times dice rolled
    public void add(int roll) {

        if (roll <= faceCounter.length) {
            faceCounter[roll - 1]++;
            numRolls++;
        }

    }
//prints dice stats
    public void printResults() {
        for (int i = 0; i < faceCounter.length; i++) {
            System.out.println((i + 1) + " was rolled ");
          
            System.out.println((faceCounter[i]) + " times");
///supposed to calculate percentage
            System.out.println( (((double)faceCounter[i] / numRolls)*100) + "%");
        }
    }
    
    
    
    
}
