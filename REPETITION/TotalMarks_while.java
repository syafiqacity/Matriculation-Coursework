//********************************************************************
//
//  Write a program segment to calculate total marks for 22 students
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 2/2/2025 (Monday)
//
//********************************************************************

import java.util.Scanner;
public class TotalMarks_while
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double total=0;
        double average;
        int i = 1;
        
        while (i<=22)
        {
            System.out.print("Enter Mark: ");
            double marks = sc.nextDouble();
            
            total=total+marks;
            
            i=i+1;
        }
        
        average=total/22;
        System.out.println("Total marks: "+total);
        System.out.println("Average: "+average);

        
    }
}
