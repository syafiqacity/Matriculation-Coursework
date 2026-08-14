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

public class Q4Salary
{
    public static void main (String[] args)
    {
        double hours;
        double totalsalary;
        double netsalary;
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter hours : ");
        hours = sc.nextDouble();
        
        totalsalary = (hours)*(8.50);
        netsalary = (totalsalary)-(totalsalary*0.09);
        
        System.out.println ();
        System.out.println ("net salary : " + netsalary);
    }
}