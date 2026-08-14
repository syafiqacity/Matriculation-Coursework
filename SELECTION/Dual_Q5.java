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

public class Dual_Q5
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double perimeter;
        double area;

        System.out.print ("Enter r : ");
        double r = sc.nextDouble();
        
        if (r%2==0)
        {
            area=0.5*r*r*3.142;
            System.out.println ("Area =" + area);   
        }
        else
        {
            perimeter= 3.142*r+(2*r);
            System.out.println ("Perimeter =" + perimeter);       
        }
    }
}