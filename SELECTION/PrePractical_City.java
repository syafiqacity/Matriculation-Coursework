//********************************************************************
//
//  This is a simple java Program to calculate and display the parking fee based on parking hours.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 9/2/2026 (Monday)
//
//********************************************************************

import java.util.Scanner;

public class PrePractical_City
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double parkingFee;
        
        System.out.print("Enter hours :");
        double hours=sc.nextDouble();
        
        if (hours<=3)
        {
            parkingFee= 6*hours;
        }
        else
        {
            parkingFee= 18+((hours-3)*3);
        }
        System.out.println("Parking Fee: " + parkingFee);
       
    }
}