/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.pkg3.pkg3.interest.calculator;
import java.util.Scanner;
import java.math.BigDecimal;

/**
 *
 * @author rosap
 */
public class Project33InterestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigDecimal loan, inRate, interest; 
char choice;
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to the Interest Calculator");
do
{
System.out.print("\nEnter loan amount: ");
loan = new BigDecimal(sc.nextLine()); 
System.out.print("Enter interest rate: ");
inRate = new BigDecimal(sc.nextLine());
interest = loan.multiply(inRate); 
loan = loan.setScale(2, 0); 
inRate = inRate.multiply(new BigDecimal(100)).setScale(3, 0);
interest = interest.setScale(2, 0); 
System.out.println("\nLoan amount:\t$" + String.format("%,.2f", loan)); 
System.out.println("Interest Rate:\t" + inRate.stripTrailingZeros().toPlainString() + "%"); 
System.out.println("Interest:\t$" + String.format("%,.2f", interest));
System.out.print("\nContinue? (y/n): ");
choice = sc.nextLine().charAt(0); 
}while(choice == 'y' || choice == 'Y');
    }
    
}
