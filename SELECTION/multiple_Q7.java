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

public class multiple_Q7
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double payment=0;
        
        System.out.print ("Enter code : ");
        char code = sc.next().charAt(0);
        
        System.out.print ("Enter quantity : ");
        int quantity = sc.nextInt();


        if (code=='U')
        {
            payment=quantity*54;
        }
        else if (code=='V')
        {
            payment=quantity*65;    
        }
        else if (code=='W')
        {
            payment=quantity*82;
        }
        else if (code=='X')
        {
            payment=quantity*103; 
        }
        else
        {
        System.out.println ("Error, this item is not on the list");
        }
        
        System.out.println ("payment : " + payment);
    }
}