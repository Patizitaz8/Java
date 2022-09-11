/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package table.of.powers;
import java.util.Scanner;

/**
 *
 * @author rosap
 */
public class TableOfPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char choice;

System.out.println("Welcome to the Squares and Cubes Table");

do{

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter an Integer: ");

int n = keyboard.nextInt();

System.out.println("Number       Squared       Cubed");

System.out.println("======       =======       ======");

for(int i=1;i<=n;++i){

System.out.printf("%-15d", i);

System.out.printf("%-15d",i*i);

System.out.printf("%-25d\n",i*i*i);

}

System.out.print("Continue (Y/N) ?");

keyboard.nextLine();

String k = keyboard.nextLine();

choice = k.charAt(0);

}while(choice=='Y' || choice=='y');
    }
    
}
