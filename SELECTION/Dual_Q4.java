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

public class Dual_Q4
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double rentalPrice;

        System.out.print ("Enter hours : ");
        double hours = sc.nextDouble();
        
        if (hours <=24)
        {
            rentalPrice=50;
    
        }
        else
        {
            rentalPrice=((hours-24)*5);
            System.out.println ("Rental Price =" + rentalPrice);       
        }
    }
}