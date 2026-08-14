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

public class multiple_Q1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter number : ");
        double number = sc.nextDouble();

        if (number > 0)
        {
            System.out.println ("Positive");
        }
        else if (number < 0)
        {
            System.out.println ("Negative");       
        }
        else
        {
            System.out.println ("Zero");      
        }
    }
}