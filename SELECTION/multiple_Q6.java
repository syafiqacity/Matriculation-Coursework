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

public class multiple_Q6
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double fee=0;
        
        System.out.print ("Enter subject : ");
        String subject = sc.next();
        
        System.out.print ("Enter hours : ");
        double hours = sc.nextDouble();

        if (subject=="MATHEMATICS")
        {
            fee=hours*50;
        }
        else if (subject=="PHYSICS")
        {
            fee=hours*60;      
        }
        else if (subject=="CHEMISTRY")
        {
            fee=hours*70;
        }
        System.out.println ("fee : " + fee);
    }
}