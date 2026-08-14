//********************************************************************
//
//  This is a simple java Program. It display Celcius value.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 8/12/2025 (Monday)
//
//********************************************************************

import java.util.Scanner;

public class Fahrenheit
{
    public static void main (String[] args)
    {
        double C;
        double F;
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Enter F : ");
        F = sc.nextDouble();
        
        C = (5.0/9.0)*(F-32);
        
        System.out.println ();
        System.out.println ("Celcius : " + C);
    }
}
        