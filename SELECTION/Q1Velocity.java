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

public class Q1Velocity
{
    public static void main (String[] args)
    {
        double distance;
        double time;
        double velocity;
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter distance : ");
        distance = sc.nextDouble();

        System.out.print ("Enter time : ");
        time = sc.nextDouble();

        velocity = distance/time;
        
        System.out.println ("velocity : " + velocity);
        
        if (velocity > 110)
        {
            System.out.println ("Over Speed Limit");
        }
    }
}