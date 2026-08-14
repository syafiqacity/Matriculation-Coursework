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

public class multiple_Q9
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double exchange=0;
        double rate=0;
        System.out.print ("Enter code : ");
        char code = sc.next().charAt(0);
        
        System.out.print ("Enter money : ");
        double money = sc.nextDouble();


        if (code==1)
        {
            rate=3387.1;
        }
        else if (code==2)
        {
            rate=0.1863;   
        }
        else if (code==3)
        {
            rate=0.21981;
        }
        else if (code==4)
        {
            rate=0.24320;
        }
        else if (code==5)
        {
            rate=26.68;
        }
        exchange= money*rate;
        
        System.out.println ("exchange : " + exchange);
    }
}