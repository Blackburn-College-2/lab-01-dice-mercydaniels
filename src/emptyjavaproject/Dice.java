/*
 * 
 */
package emptyjavaproject;

/**
 *
 * @author mercy.daniels
 */
public class Dice {
    //default to six
   private int side = 6;
    
    public Dice(int sideNumber){
       side = sideNumber; 
    }
   //randomizes dice sides
    public int roll() {
   
    return (int)((Math.random()* side) + 1);
    }
   //used for calculations
 public int getFaces() {
       return side;
    }
}
