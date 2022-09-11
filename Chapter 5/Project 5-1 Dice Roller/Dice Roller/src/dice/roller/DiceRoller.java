/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dice.roller;
import java.util.Scanner;
/**
 *
 * @author rosap
 */
public class DiceRoller {

        private static String userChoice(Scanner sc,String prompt) {
		
		System.out.println("\n"+prompt);

		return sc.next();
	}
	private static int rollDie() {
        return (int)(Math.random()*6)+1;
	}
	private static void printdice(int die1,int die2) {
		System.out.println("\nDie 1: "+die1);
		System.out.println("Die 2: "+die2);
		System.out.println("Total: "+(die1+die2));
		
	}
	private static void printMessage(int total)
	{
		if(total==12)
		{
			System.out.println("Boxcars!");
		}
		if(total==2)
		{
			System.out.println("Snake eyes!");
		}
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dice Roller");
         Scanner in= new Scanner(System.in);
         
         String input=userChoice(in,"Roll the dice? (y/n):");
         
          do {
        	 int d1=rollDie();
 			int d2=rollDie();
 			printdice(d1,d2);
 			printMessage(d1+d2);
        	 
        	 input=userChoice(in,"Roll again? (y/n):");
        }while(input.equals("y"));
        
    }
    
}
