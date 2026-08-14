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

public class multiple_Q2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter jobPerformance : ");
        double jobPerformance = sc.nextDouble();

        if (jobPerformance>= 80 && jobPerformance<= 100)
        {
            System.out.println ("Excellent");
        }
        else if (jobPerformance>= 70 && jobPerformance<= 79)
        {
            System.out.println ("Moderate");       
        }
        else if (jobPerformance<70)
        {
            System.out.println ("Low");      
        }
    }
}