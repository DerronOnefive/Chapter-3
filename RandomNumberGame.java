/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergame;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
