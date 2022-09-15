/*
 *class: divisibleby3and5
 *  Author: Derron Pierre
 * Version: 1.1
 * Course ITEC 2140
 * Written : September 15 2022
 * This program will run days of the week when user inputs a number
 */
package divisibleby3and5;
import java.util.Scanner;


public class DIvisibleBy3And5 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = in.nextInt();

        if (num% 3 == 0 && num% 5 == 0)
            System.out.println("Divisible by 3 and 5");
        else if (num% 3 == 0)
            System.out.println("Divisible by 3 but not 5");
        else if (num% 5 == 0)
            System.out.println("Divisible by 5 but not by 3");
        else
            System.out.println("Neither divisible by 3 nor by 5");


    }

}
