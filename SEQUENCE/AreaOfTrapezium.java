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

public class AreaOfTrapezium
{
    public static void main (String[] args)
    {
        
        double area;
        double base1;
        double base2;
        double height;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Enter Base 1 : ");
        base1 = sc.nextDouble();
        
        System.out.println ("Enter Base 2 : ");
        base2 = sc.nextDouble();
        
        System.out.println ("Enter Height : ");
        height = sc.nextDouble();
        
        area = 0.5 * (base1 + base2) * height;
        System.out.println();
        System.out.println ("Area of Trapezium : " + area);
    }
}