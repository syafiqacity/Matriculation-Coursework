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

public class Dual_Q2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double total;
        double average;

        System.out.print ("Enter num1 : ");
        double num1 = sc.nextDouble();
        
        System.out.print ("Enter num2 : ");
        double num2 = sc.nextDouble();

        if (num1 > num2)
        {
            total = num1 + num2;
            System.out.println ("total =" + total);
        }
        else
        {
            average = (num1 + num2)/2;
            System.out.println ("average =" + average);       
        }
    }
}