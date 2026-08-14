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

public class Q3Price
{
    public static void main (String[] args)
    {
        int books;
        double total_price;
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter books : ");
        books = sc.nextInt();

        total_price = books*50;
        
        if (total_price >= 200)
        {
            System.out.println ("You get RM20.00 voucher");
        }
        System.out.println ("total price : " + total_price);
    }
}