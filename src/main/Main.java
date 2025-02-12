package main;

import java.util.Random;
import java.util.Scanner;

public class Main{

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Hello world!");


        int number_of_computer = rand.nextInt(101);

        System.out.print("Enter your number: ");
        int player_quess = scanner.nextInt();

        while (player_quess != number_of_computer) {
            System.out.println ("false number");
            System.out.println ("Enter your number: ");
            player_quess = scanner.nextInt();

            if (player_quess > number_of_computer) {
                System.out.println("number should be smaller");
            }

            else {
                System.out.println("number should be greater");
            }
            }
        if (player_quess == number_of_computer) {
            System.out.print ("You win");
        }

    }

}