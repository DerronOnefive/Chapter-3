/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisibleby3and5;
import java.util.Scanner;


public class DIvisibleBy3And5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
