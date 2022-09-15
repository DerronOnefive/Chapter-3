/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package days;
import java.util.Scanner;


public class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
