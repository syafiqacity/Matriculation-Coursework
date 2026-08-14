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

public class Q1Marks
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter marks : ");
        double marks = sc.nextDouble();

        if (marks >= 45)
        {
            System.out.println ("Pass, congratulations!");
        }
        else
        {
            System.out.println ("Failed, Try Again");       
        }
    }
}