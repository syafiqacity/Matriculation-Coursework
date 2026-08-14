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

public class Q2Age
{
    public static void main (String[] args)
    {
        int age;
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter age : ");
        age = sc.nextInt();
                
        if (age < 12)
        {
            System.out.println ("child");
        }
    }
}