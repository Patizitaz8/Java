/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessing.game;
import java.util.Scanner;

/**
 *
 * @author rosap
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("Welcome to the Guess the Number Game\n" +
                "++++++++++++++++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        char choice=' ';
        do {
            int randomNumber  =(int)(100.0*Math.random());
            int countTry =0,number;
            boolean win = false;
            while (!win) {
                System.out.println("I'm thinking of a number from 1 to 100.");
                System.out.println("Try to guess it.");
                number = getIntWithinRange(sc, "Enter number: ", 1, 100);
                countTry++;
                if (number < randomNumber && countTry < 10) {
                    System.out.println("Too low! Guess again.");
                }
                if (number > randomNumber && countTry < 10) {
                    System.out.println("Too high! Guess again.");
                }
                if (number < randomNumber && countTry >= 10) {
                    System.out.println("Way too low! Guess again.");
                }
                if (number > randomNumber && countTry >= 10) {
                    System.out.println("Way too high! Guess again.");
                }
                if (randomNumber == number) {
                    System.out.println("You got it in " + countTry + " tries.");
                    if (countTry <= 3)
                        System.out.println("Great work! You are a mathematical wizard.");
                    else if (countTry > 3 && countTry <= 7)
                        System.out.println("Not too bad! You've got some potential.");
                    else
                        System.out.println("What took you so long? Maybe you should take some lessons.");
                    win = true;
                }
            }

            choice = getCharWithinRange(sc,"Try again? (y/n): ");
            if(choice=='n' || choice =='N')
                System.out.println("Bye - Come back soon!");

        }while (choice=='y' || choice=='y');

    }
    public static char getCharWithinRange(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        char choice = sc.next().charAt(0);
        while (choice!='Y' && choice!='y' && choice!='n' && choice!='N')
        {
            if(choice==' ')
                System.err.println("Error! This entry is required. Try again.");
            else
            System.err.println("Error! Entry must be 'y' or 'n'. Try again.");
            System.out.print(prompt);
            choice = sc.next().charAt(0);
        }
        return choice;
    }
    public static int getIntWithinRange(Scanner sc, String prompt,int min, int max)
    {
        System.out.print(prompt);
        int num = sc.nextInt();
        while (num<min || num>max)
        {
            System.err.println("ERROR!!!! ... invalid number entered");
            System.out.print(prompt);
            num = sc.nextInt();
        }
        return num;
    }
    
}
