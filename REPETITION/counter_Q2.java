//********************************************************************
//
//  Write a program segment to display the message"Welcome to KMM!" exactly 10 times (counter-controlled)
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 8/12/2025 (Monday)
//
//********************************************************************

import java.util.Scanner;

public class counter_Q2
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner (System.in);
        int counter = 1;
        
        while (counter <= 20)
        {
            System.out.print ("Enter quiz answer : ");
            String quiz_answer = sc.next();
            
            System.out.println ("Quiz answer : " + quiz_answer );

            
            counter = counter+1;
        }
        
    }
}
