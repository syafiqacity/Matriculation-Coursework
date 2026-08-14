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
public class TotalMarks_MaxMin
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double total;
        double average;
        double marks;
        double max;
        double min;
        
        System.out.print("Enter Mark: ");
        marks = sc.nextDouble();
        
        total=marks;
        max=marks;
        min=marks;
        
        
        for (int i = 1; i<=5; i=i+1)
        {
            System.out.print("Enter Mark: ");
            marks = sc.nextDouble();
            
            total=total+marks;
            
            if (marks > max)
            {
                max=marks;
            }
            
            if (marks < min)
            {
                min=marks;
            }
        }
        
        average=total/5;
        System.out.println("Total marks: "+total);
        System.out.println("Average: "+average);
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        
    }
}
