//***************************************************************************************************
//
//  This is a simple java Program to search playerID in array based on searchRegion.
//  Determine index, playHours based on searchRegion. 
//  Calculate totalPlayers based on searchRegion or message “No players found in this region.”
//  This process is repeat for 8 players.
//
//  Name   : City Maryam Syafiqa Binti Nordin
//  Matric : MS2411270019
//  Group  : F4T1
//  Date   : 20/02/2026 (Friday)
//
//***************************************************************************************************

import java.util.Scanner;

public class PlayerTracker
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);//create object for class Scanner named sc
        
        //Declare arrays
        String[] playerID = new String[8];//declare and create array name playerID with data type String
        double[] playHours = new double[8];//declare and create array name playHours with data type double
        char[] region = new char[8];//declare and create array name region with data type char
        
        int totalPlayers = 0; //declare variable totalPlayers with data type int and assign 0 to totalPlayers
        
        // Input data for 8 players
        for (int index = 0; index < 8; index = index + 1)//for loop to read playerID, playHours and extract first character from playerID as region for 8 times
        {
            
            System.out.println("Player " + (index + 1));//output statement to display the player's number
            
            System.out.print("Enter Player ID: ");//user prompt to ask user to enter playerID
            playerID[index] = sc.next();//input statement to accept data playerID and store into array playerID
            
            System.out.print("Enter active play duration (hours): ");//user prompt to ask user to enter playHours
            playHours[index] = sc.nextDouble();//input statement to accept data playHours and store into array playHours
            
            //Extract first character from playerID and set as region
            region[index] = playerID[index].charAt(0);
            
            System.out.println();//output statement so that the next output starts on a new line
            
        }
        
        // Input region to search
        System.out.print("Enter region letter to search: ");//user prompt to ask user to enter searchRegion
        char searchRegion = sc.next().charAt(0);//input statement to accept data searchRegion and store into array searchRegion
        
        System.out.println();//output statement so that the next output starts on a new line
        
        System.out.println("Matching Players: ");//output statement to display the "matching players: "
        
        // Linear search
        for (int index = 0; index < 8; index = index + 1)//for loop to read if region equal to searchRegion
        {
            if (region[index] == searchRegion)//if statement to check whether region is equal to searchRegion
            {
                System.out.println("Index Position: " + index);//output statement to display the index position
                System.out.println("Active Play Duration: " + playHours[index] + "hours");//output statement to display the respective playHours
                System.out.println();//output statement so that the next output starts on a new line
                totalPlayers = totalPlayers + 1;//process to calculate totalPlayers with the same searchRegion
                
            }
        }
        
        // Display result
        if (totalPlayers == 0)//if statement to check whether totalPlayers is equal to 0
        {
            System.out.println("No players found in this region.");//output statement of messages no players found in the array
        }
        else
        {
            System.out.println("Total players in region: " + totalPlayers);//output statement tp display totalPlayers
        }

    }
}