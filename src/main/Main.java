package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    static int read_player_number () {
        System.out.print("Enter your number: ");
        int player_quess = scanner.nextInt();
        return player_quess;
    }

    public static void main(String[] args) {
        int number_of_computer = rand.nextInt(101);
        int player_quess = read_player_number ();

        while (player_quess != number_of_computer) {
            System.out.println ("false number");

            if (player_quess > number_of_computer) {
                System.out.println("number should be smaller");
            } else {
                System.out.println("number should be greater");
            }

            player_quess = read_player_number ();
        }

        if (player_quess == number_of_computer) {
            System.out.print ("You win");
        }
    }
}
