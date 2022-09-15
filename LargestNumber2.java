/*
 *class: LargestNumber2
 *  Author: Derron Pierre
 * Version: 1.1
 * Course ITEC 2140
 * Written : September 15 2022
 * This program will run the largest number input
 */
package largestnumber2;

import java.util.Scanner;


public class LargestNumber2 {


    public static void main(String[] args) {


        int a,b,c,largest,temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
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
