/*
 *class:Insurance
 *  Author: Derron Pierre
 * Version: 1.1
 * Course ITEC 2140
 * Written : September 15 2022
 * This program will run to calculate the cost insurance base on the age of insurance holder.
 */
import java.util.*;
public class Insurance {
  public static void main(String[] args ) {
    int age ;
      int accident;
    int surcharge;
    int base_insurance_cost=300; 
    int total_ins;
    Scanner sc=now Scanner(System.in);
    System.out.println(*Enter age of the driver:*);
    age=sc.nextInt();
    if (age<27){ //if driver age age  is less than 27 executes inside code
      System.out.println(*Enter number of accidents:*);
      accidents=sc.nextInt();// taking surcharge as user input
      if(accidents==1) {
        surcharge = 100
          total_ins= base_insurance_cost+surcharge;
        System.out.println("Total insurance is:" + total_ins);//printing total
      }
      if(accidents==2){
        surcharge=150;
        total_ins= base_insurance_cost+surcharge;
        System.out.println("Total insurance is": +total_ins);
      }
      if(accidents==3){
        surcharge=250;
        total_ins= base_insurance_cost+surcharge;
        System.out.println("Total insurance is": +total_ins);
      }
      if(accidents==3){
        sucharge=1000;
        total_ins= base_insurance_cost+surcharge;
          System.out.println("Total insurance is": +total_ins);
      }
    }
    else{//if driver age is greater than 27 it executes inside 
      System.out.println("Age has to be less than 27");
    }
  }
}
        
         
        
      
