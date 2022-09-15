/*
 *class: Days
 *  Author: Derron Pierre
 * Version: 1.1
 * Course ITEC 2140
 * Written : September 15 2022
 * This program will run days of the week when user inputs a number
 */
package days;
import java.util.Scanner;



public class Days {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Input number:");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }
    public static String getDayName(int day){
        String dayName = "";
        switch (day){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        return dayName;
    }

}
