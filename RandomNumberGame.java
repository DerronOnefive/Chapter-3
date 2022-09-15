/*
 *class: RandomNumberGame
 *  Author: Derron Pierre
 * Version: 1.1
 * Course ITEC 2140
 * Written : September 15 2022
 * This program will run to prompt the user to guess randomns number until the guess is right.
 */
package randomnumbergame;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {


    public static void main(String[] args) {

        int answer, guess;

        final int Max = 10;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        boolean correct = false;

        answer = rand.nextInt(Max) + 1;

        while (!correct){
            System.out.println("Guess a Number betwwen 1 and 10:");
            guess = in.nextInt();
            if(guess > answer){
                System.out.println("Too high, you lost");}
            else if (guess < answer){
                System.out.println("Too low, you lost");
            }
            else{
                System.out.println("Horray you guessed the number.");
                correct = true;

            }


        }
        System.exit(0);
    }

}
