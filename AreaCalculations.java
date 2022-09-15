/*
 *class:AreaCalculations
 *  Author: Derron Pierre
 * Version: 1.1
 * Course ITEC 2140
 * Written : September 15 2022
 * This program will run to prompt the user to enter a radius and slove the area.
 */
package areacalculations;
import java.util.Scanner;


public class AreaCalculations {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("The Radius value entered by user is:");
        double r = s.nextDouble();
        double area = (22*r*r)/7;
        System.out.println("The calculated value of the circle area:" + area);


    }

}
