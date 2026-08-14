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

public class multiple_Q8
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double fee=0;
        
        System.out.print ("Enter people : ");
        int people = sc.nextInt();


        if (people>15)
        {
            fee=people*80;
        }
        else if (people>=11 && people<=15)
        {
            fee=people*100;  
        }
        else if (people>=6 && people<=10)
        {
            fee=people*150;
        }
        else if (people>=1 && people<=5)
        {
            fee=people*200;
        }
        else
        {
        System.out.println ("error");
        }
        
        System.out.println ("fee : " + fee);
    }
}