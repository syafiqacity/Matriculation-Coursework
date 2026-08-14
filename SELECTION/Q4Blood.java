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

public class Q4Blood
{
    public static void main (String[] args)
    {
        double BMI;
        char BloodType;
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter BMI : "); 
        BMI = sc.nextDouble();

        System.out.print ("Enter BloodType : ");
        BloodType = sc.next().charAt(0);
        
        if (BMI >= 25 && BMI <= 29.9 && BloodType=='A');
        {
            System.out.println ("You are eligible to donate");
        }
    }
}