import java.awt.*;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class DiceRollingApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Grand Circus Casino");
        System.out.println("How many sides should each die have?: ");
        
        Scanner sc = new Scanner(System.in);
    	
    	Dice dice = new dice();
        System.out.println("Previous: " + dice.previousRoll);
        System.out.println(dice.roll());
        System.out.println("Previous: " + dice.previousRoll);
        System.out.println(dice.roll());
        System.out.println("Previous: " + dice.previousRoll);
    }
    
    public class Dice {
        Random rand;
        int previousRoll = -1;

        public Dice() {
            this.rand = new Random();
        }

        public int roll() {
            int currentRoll = this.rand.nextInt(6) + 1;
            this.previousRoll = currentRoll;
            return currentRoll;
        }
    }

}
