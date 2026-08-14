//********************************************************************
//
//  This is a simple java Program for a library system to calculate the late fee for returning books.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 23/2/2026 (Monday)
//
//********************************************************************

import java.util.Scanner;

public class Practical_City
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double LateFee;

        System.out.print ("Enter the number of days a book is overdue : ");
        int days = sc.nextInt();
        
        if (days <=7)
        {
            LateFee=days*0.30;
            System.out.println ("Late Fee = " + LateFee);
    
        }
        else
        {
            LateFee=((days-7)*0.50)+2.1;
            System.out.println ("Late Fee = " + LateFee);       
        }
        
    }
}
