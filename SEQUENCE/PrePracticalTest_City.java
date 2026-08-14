//********************************************************************
//
//  This is a simple java Program for Pre Practical Test.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 19/1/2026 (Monday)
//
//********************************************************************

import java.util.Scanner;

public class PrePracticalTest_City
{
    public static void main (String[] args)
    {
        double r1;
        double r2;
        double v1;
        double v2;
        double difference;
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Enter radius ball 1 : ");
        r1 = sc.nextDouble();
        
        System.out.print ("Enter radius ball 2 : ");
        r2 = sc.nextDouble();
        
        v1=((4.0/3.0)*(3.142*(r1*r1*r1)));
        
        v2=((4.0/3.0)*(3.142*(r2*r2*r2)));
        difference= v2-v1;
        
        System.out.println ();
        System.out.println ("volume ball 1 : " + v1);
        System.out.println ("volume ball 2 : " + v2);
        System.out.println ("Volume different between ball 1 and ball  2 : " + difference);
    }
}