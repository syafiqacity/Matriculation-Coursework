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

public class multiple_Q3
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double payment=0;

        System.out.print ("Enter size : ");
        char size = sc.next().charAt(0);
        
        System.out.print ("Enter days : ");
        int days = sc.nextInt();


        if (size == 'S')
        {
            payment= days*50;
        }
        else if (size == 'M')
        {
            payment= days*80;       
        }
        else if (size == 'L')
        {
            payment= days*100;   
        }
        System.out.println ("payment : " + payment);
    }
}