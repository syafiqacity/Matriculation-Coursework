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

public class multiple_Q4
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double bill=0;
        
        System.out.print ("Enter usage : ");
        double usage = sc.nextDouble();


        if (usage<=20)
        {
            bill= usage*0.4;
        }
        else if (usage<=40)
        {
            bill= 8+((usage-20)*0.2);      
        }
        else 
        {
            bill= 12+((usage-40)*0.1);  
        }
        System.out.println ("bill : " + bill);
    }
}