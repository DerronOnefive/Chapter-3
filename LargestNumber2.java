/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnumber2;

import java.util.Scanner;


public class LargestNumber2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int a,b,c,largest,temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter firts number:");
        a=sc.nextInt();
        
        System.out.println("Enter second number:");
        b=sc.nextInt();
        
        System.out.println("Enter third number:");
        c=sc.nextInt();
        
        temp=a>b?a:b;
        
        largest=c>temp?c:temp;
        
        System.out.println("The largest number is:" +largest);
    }
    
}
