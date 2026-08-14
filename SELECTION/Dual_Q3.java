//********************************************************************
//
//  This is a simple java Program to calculate velocity based on distance and time. Determine message "Over Speed Limit" or none based on velocity.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 8/12/2025 (Monday)
//
//********************************************************************

import java.util.Scanner;

public class Dual_Q3
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double BMI;

        System.out.print ("Enter weight : ");
        double weight = sc.nextDouble();
        
        System.out.print ("Enter height : ");
        double height = sc.nextDouble();
        
        BMI = weight/(height*height);


        if (BMI >= 25.0)
        {
            System.out.println ("Please reduce your weight");
        }
        else
        {
            System.out.println ("You have an ideal weight");       
        }
    }
}