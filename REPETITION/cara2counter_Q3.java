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

public class cara2counter_Q3
{
    public static void main (String[] args)
    {
        int counter = 1;
        int series= 1;
        while (counter <= 10)
        {
            System.out.println(series);
            series= series*3;
        
            counter = counter+1;
        }
        
    }
}
