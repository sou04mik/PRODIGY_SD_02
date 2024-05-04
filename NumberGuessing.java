/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessing;

/**
 *
 * @author soumi
 */
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("The number thatconsole has chosen is between 1 to 100.Identify it,can you?");
        do {
            System.out.print("Put the number you guessed:");
            guess = sc.nextInt();
            attempts=attempts+1;

            if (guess <number)
            {
                System.out.println("Too little! Try it one more.");
            } 
            else if (guess > number)
            {
                System.out.println("Too big! Try it one more.");
            }
        } 
        while (guess != number);

        System.out.println("Congratulations! You made " + attempts + " attempts at guessing the number:"+guess+"correctly");
    }
}
