
package BodyMassIndex;
import java.util.Scanner;


public class BodyMassIndex
{

   

    

    public static double BodyMassIndex(double height, double weight)

    {

        double bmi = weight / Math.pow(height, 2);

        return bmi;

    }

    

    public static void main(String[] args)

    {

        double height = 0.0254;

        double weight = 0.4536;

       

       

        double bmi = BodyMassIndex(height, weight);

        System.out.print("The BMI is " + bmi + " so ");

       

       

        if (bmi < 18.5)

            System.out.print("underweight");
 

        else if (bmi >= 18.5 && bmi < 25.0)

            System.out.print("Healthy");
 

        else if (bmi >= 25.0 && bmi < 30)

            System.out.print("overweight");
 

        else if (bmi >= 30)

            System.out.print("Suffering from Obesity");

    }
}
 
