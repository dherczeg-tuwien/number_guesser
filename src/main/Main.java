package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int COMPUTER_GUESS_RANGE = 6;

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static int numbers_of_quesses = 1;

    /**
     * bestimmt ob der gebebenen Zeichen in einer ganzen Zahl umgewandelt werden könnnen.
     * Wenn nicht, wird ein Fehler ausgegeben und wird -1 zurückgegeben.
     * Wenn die Zahl gültig war, wird bestimmt, ob die Zahl positiv ist und kleiner als
     * COMPUTER_QUESS_RANGE ist.
     * Wenn die Zahl in Definitionsbereich ist, wird sie zurückgegeben, sonst wird ein Fehler
     * angezeigt und -1 zurückgegeben.
     * @param player_quess ist die Zahl, die ungewandelt werden sollen.
     * @return ungewandelte Zahl güötig sonst -1
     */
    private static int convertPlayerInputToNumber(String player_quess) {
        int convertedQuess;
        try {
            convertedQuess = Integer.parseInt(player_quess);
        } catch (Exception e) {
            System.out.println("it should be a number");
            return -1;
        }
        if (convertedQuess > COMPUTER_GUESS_RANGE || convertedQuess < 0) {
            System.out.println("You have entered an invalid number!");
            return -1;
        }
        return convertedQuess;
    }

    /**
     * die Funktion liest solange Eingaben ein, bis der Spieler eine Zahl zwishcen 0 und COMPUTER_GUESS_RANGE
     * eingibt.
     * @return gibt gültige Zahl
     */
    static int read_player_number () {
        int player_quess;
        do {
            System.out.print("Enter your number between 0 and " + (COMPUTER_GUESS_RANGE - 1) + ": ");
            player_quess = convertPlayerInputToNumber(scanner.next());
        } while (player_quess == -1);
        return player_quess;
    }

    public static void main(String[] args) {
        do {

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
            System.out.println("wollen Sie weiter spielen? (y/n)");
            numbers_of_quesses = 1;

        } while (scanner.next().toLowerCase().charAt(0) == 'y');
    }

}
