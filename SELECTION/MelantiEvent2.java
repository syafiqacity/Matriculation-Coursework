//********************************************************************
//
//  This is a simple java Program to calculate velocity based on distance and time. Determine message "Over Speed Limit" or none based on velocity.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 8/12/2025 (Monday)
// notes: kalau buat kiraan dkt luar, kena initialized dkt declare tu conth: double discount=0
//********************************************************************

import java.util.Scanner;
public class MelantiEvent2
{
    public static void main(String[]args)
    {
        double discount=0;
        double totalPBD=0;
        double totalPAD;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Genre :");
        char genre= sc.next().charAt(0);
        
        System.out.print("Enter quantity :");
        int quantity= sc.nextInt();
        
        if (genre=='T')
        {
            totalPBD=30.90*quantity;
            discount= 0.10*totalPBD;
            
        }
        
        else if (genre=='F')
        {
            totalPBD=38.90*quantity;
            discount= 0.20*totalPBD;
            
        }
        
        else if (genre=='S')
        {
            totalPBD=35.90*quantity;
            discount= 0.25*totalPBD;
        
            
        }
        
        totalPAD= totalPBD-discount;
            
            System.out.println("Total payment before discount :" + totalPBD);
            System.out.println("Total discount :" + discount);
            System.out.println("Total payment after discount :" + totalPAD);
            
        
    }
    
    
}
