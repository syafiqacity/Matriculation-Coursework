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

public class multiple_Q10
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double charge=0;
        double price=0;
        System.out.print ("Enter code : ");
        char code = sc.next().charAt(0);
        
        System.out.print ("Enter quantity : ");
        int quantity = sc.nextInt();


        if (code=='B')
        {
            price=quantity*20;
        }
        else if (code=='L')
        {
            price=quantity*50;  
        }
        else if (code=='D')
        {
            price=quantity*70;
        }
        charge=1.06*price;
        
        System.out.println ("charge : " + charge);
    }
}