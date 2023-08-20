package com.codsoft;

import java.util.Scanner;
import java.util.Random;

public class NGG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int start_range = 1;
        int end_range = 100;
        boolean hasGuessedCorrectly = false;
        int max_attempts = 5;

        System.out.println("Hey player! let's start the game. ");
        System.out.println("Guess a number between" + start_range + "  and " + end_range + " .");

        boolean replay = true;
        while (replay) {

            int computer_num = random.nextInt(end_range - start_range + 1) + start_range;
            int attempts = 0;

            while (attempts < max_attempts) {
                System.out.println("Enter your guess: ");
                int user_guess = sc.nextInt();
                attempts++;

                if (user_guess == computer_num) {
                    System.out.println("Congratulations! you guessed the correct numer");
                    hasGuessedCorrectly = true;
                    break;
                } else if (user_guess < computer_num) {
                    System.out.println(" Your guess is too low.");
                } else {
                    System.out.println(" Your guess is too high.");
                }
            }
            if ( !hasGuessedCorrectly) {
                System.out.println("Sorry! you have reached at your maximum attempts and the correct number was  " + computer_num);
            }
             System.out.println("Game Over!  ");
            System.out.println("Do you want to play again? (yes/no)  ");
            String response = sc.next().toLowerCase();
            replay = response.equals("yes");

        }
       

    }

}
