//********************************************************************
//
//  This is a simple java Program for Practical Test.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 8/12/2025 (Monday)
//
//********************************************************************

import java.util.Scanner;

public class PracticalTest_City
{
    public static void main (String[] args)
    {
        int adult;
        int child;
        double adult_total_price;
        double child_total_price;
        double total_entrance_fee_before_tax;
        double service_tax;
        double total_entrance_fee_after_tax;

        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter adult : ");
        adult = sc.nextInt();
        
        System.out.print ("Enter child : ");
        child = sc.nextInt();
        
        adult_total_price=adult*10;
        child_total_price=child*5;
        total_entrance_fee_before_tax=(adult_total_price)+(child_total_price);
        service_tax=(0.04)*(total_entrance_fee_before_tax);
        total_entrance_fee_after_tax=(total_entrance_fee_before_tax)+(service_tax);
        
        System.out.println ();
        System.out.println ("adult total price : " +adult_total_price);
        System.out.println ("child total price : " +child_total_price);
        System.out.println ("total entrance fee before tax : " +total_entrance_fee_before_tax);
        System.out.println ("service tax : " +service_tax);
        System.out.println ("total entrance fee after tax : " +total_entrance_fee_after_tax);
    }
}