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

public class multiple_Q5
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double bill=0;
        double discount=0;
        System.out.print ("Enter usage : ");
        double usage = sc.nextDouble();


        if (usage<=50)
        {
            discount=0;
        }
        else if (usage<=100)
        {
            discount=(usage-50)*0.05;    
        }
        else 
        {
            discount=((usage-100)*0.02)+25; 
        }
        bill=usage-discount;
        
        System.out.println ("bill : " + bill);
    }
}