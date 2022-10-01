/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grade.converter;

import java.util.Scanner;

/**
 *
 * @author rosap
 */
public class GradeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console console = new Console();

        System.out.println("Welcome to the Letter Grade Converter");

        Grade grade = new Grade();

        while (true) {

            int number = console.get_number();
            grade.setNumber(number);

            System.out.println("Letter grade: " + grade.getLetter());

            String choice = console.get_choice();

            if (choice.equals("n")) {
                break;
            }
        }
    }

}
