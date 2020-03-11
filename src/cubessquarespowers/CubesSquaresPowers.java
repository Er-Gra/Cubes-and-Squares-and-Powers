/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cubessquarespowers;

import java.util.Scanner;

public class CubesSquaresPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //declared variables for operations
        int base;
        int squared;
        int cubed;
        int exponent;
        int total;
        
        //menu
        System.out.println("Please enter your choice\n" + 
            "1... Find the value of a number squared\n" +
            "2... Find the value of a number cubed\n" +
            "3... Find the value of a number, to any power\n" +
            "4... Exit");
        int decision = input.nextInt();
        
        //loop statement so that the code repeats after each operation
        while (decision !=4)
        {
            if (decision == 1)  //nested if statement
            {
                System.out.println("Enter the value of the base");
                base = input.nextInt();

                //number squared
                squared = base * base;
                System.out.println(base+" squared = "+squared);
            }
            if (decision == 2)
            {
                System.out.println("Enter the value of the base");
                base = input.nextInt();

                //number squared
                cubed = base * base * base;
                System.out.println(base+" cubed = "+cubed);
            }
            if (decision == 3)
            {
                System.out.println("Enter the value of the base");
                base = input.nextInt();
                System.out.println("Enter the value of the exponent");
                exponent = input.nextInt();

                //number random exponent ooperation
                total = base * base * base;
                System.out.println(base +" raised to the exponent "+ exponent + " = " + total);
            }
        //while statement
            System.out.println("Please enter your choice\n" + 
            "1... Find the value of a number squared\n" +
            "2... Find the value of a number cubed\n" +
            "3... Find the value of a number, to any power\n" +
            "4... Exit");
            decision = input.nextInt();
        }
        
        //closing if statement
        if (decision == 4)
        {
            System.out.println("Program closed");
        }
    }
    
}
