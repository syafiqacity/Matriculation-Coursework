//********************************************************************
//
//  This is a simple java Program to calculate Area Of Trapezium.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 8/12/2025 (Monday)
//
//********************************************************************

import java.util.Scanner;

public class Q5TotalPaid
{
    public static void main (String[] args)
    {
        int adults;
        int child;
        double totalpaid;
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter adults : ");
        adults = sc.nextInt();
        
        System.out.print ("Enter child : ");
        child = sc.nextInt();
        
        totalpaid = (adults*15)+(child*6);
        
        System.out.println ();
        System.out.println ("Total Paid : " + totalpaid);
    }
}