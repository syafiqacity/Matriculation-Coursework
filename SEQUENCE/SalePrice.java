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

public class SalePrice
{
    public static void main (String[] args)
    {
        double price;
        double saleprice;
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter price : ");
        price = sc.nextDouble();
        
        saleprice = (0.3)*(price);
        
        System.out.println ();
        System.out.println ("sale price : " + saleprice);
    }
}