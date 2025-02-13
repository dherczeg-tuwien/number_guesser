package main;

import main.enums.Color;
import main.enums.TextDecoration;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int COMPUTER_GUESS_RANGE = 101;

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static int numbers_of_quesses = 1;

    static final String DECORATED_ERROR_MESSAGE = OutputFormatter.applyDecoration(
            TextDecoration.BOLD,
            OutputFormatter.applyForegroundColor(
                    Color.RED,
                    "You must pick a valid number!",
                    true
            ),
            true
    );
    static final String DECORATED_SMALLER_MESSAGE = OutputFormatter.applyForegroundColor(
            Color.YELLOW,
            "Number should be smaller!",
            true
    );
    static final String DECORATED_GREATER_MESSAGE = OutputFormatter.applyBackgroundColor(
            Color.CYAN,
            "Number should be larger!",
            true
    );
    static final String DECORATED_WIN_MESSAGE = OutputFormatter.applyDecoration(
            TextDecoration.UNDERLINE,
            OutputFormatter.applyForegroundColor(
                    Color.GREEN,
                    "You win!",
                    true
            ),
            true
    );

    // TODO: Number validation (display to users that the computer guesses a number between x and y, reject guesses outside of that range)

    static int read_player_number () {
        System.out.print("Enter your number: ");
        int player_quess = -1;
        try {
            player_quess = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(DECORATED_ERROR_MESSAGE);
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
                System.out.println(DECORATED_SMALLER_MESSAGE);
            } else {
                System.out.println(DECORATED_GREATER_MESSAGE);
            }

            player_quess = read_player_number ();
            numbers_of_quesses++;
        }
        System.out.println (DECORATED_WIN_MESSAGE);
        System.out.println ("it took you " + numbers_of_quesses + " quesses");
    }

}
