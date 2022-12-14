/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grade.converter;

import java.util.Scanner;

/**
 *
 * @author rosap
 */
public class Console {

    Scanner sc = new Scanner(System.in);

    public int get_number() {

        System.out.print("Enter numerical grade: ");

        if (sc.hasNextInt()) {

            int number = sc.nextInt();

            sc.nextLine();

            return number;
        }

        sc.nextLine();

        System.out.println("Error! Invalid integer. Try again.");

        return get_number();

    }

    public String get_choice() {

        System.out.print("Continue? (y/n): ");

        String choice = sc.nextLine();

        if (choice.equals("y") || choice.equals("n")) {

            return choice;
        }

        if (choice.equals("")) {

            System.out.println("Error! This entry is required. Try again.");

            return get_choice();
        }

        System.out.println("Error! Entry must be 'y' or 'n'. Try again.");

        return get_choice();

    }

}
