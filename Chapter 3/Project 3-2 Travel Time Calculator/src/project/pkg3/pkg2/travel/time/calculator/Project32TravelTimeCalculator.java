/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.pkg3.pkg2.travel.time.calculator;
import java.util.Scanner;

/**
 *
 * @author rosap
 */
public class Project32TravelTimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Calculator");  
		float distance,speed;
		String choice="y";
		
		while (choice.equals("y")){    
			System.out.print("\nEnter miles: ");  
			distance = sc.nextFloat();
			
			System.out.print("Enter miles per hour: ");  
			speed = sc.nextFloat();
			double time = (distance/speed);
			int hours = (int)time;
			int minutes = (int)(((time-(int)(time)))*60); //(int)(distance%speed);
			
			System.out.println("Estimated travel time\n------------------\nHours: "+hours+"\nMinutes: "+minutes);
			System.out.print("Continue?(y/n): ");
			
			sc.nextLine();
			choice = sc.nextLine();
			}  
		

    }
    
}
