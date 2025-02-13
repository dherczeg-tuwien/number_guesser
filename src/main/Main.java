package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int COMPUTER_GUESS_RANGE = 26;

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static int numbers_of_quesses = 1;

    static int read_player_number () {
        System.out.print("Enter your number between 0 and " + (COMPUTER_GUESS_RANGE - 1) + ": ");
        int player_quess = -1;
        try {
            player_quess = scanner.nextInt();
            if (player_quess > COMPUTER_GUESS_RANGE || player_quess < 0) {
                System.out.println("You have entered an invalid number!");
            }
        } catch (Exception e) {
            System.out.println("it should be a number");
            scanner.next();
        }
        return player_quess;
    }

    public static void main(String[] args) {
        int number_of_computer = rand.nextInt(COMPUTER_GUESS_RANGE);
        int player_quess = read_player_number ();

        while (player_quess != number_of_computer) {
            System.out.println ("false number");

            if (player_quess > number_of_computer) {
                System.out.println("number should be smaller");
            } else {
                System.out.println("number should be greater");
            }

            player_quess = read_player_number ();
            numbers_of_quesses++;
        }

        System.out.println ("You win");
        System.out.println ("it took you " + numbers_of_quesses + " quesses");
    }

}
