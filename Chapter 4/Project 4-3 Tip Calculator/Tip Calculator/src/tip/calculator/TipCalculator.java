/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tip.calculator;
import java.util.Scanner;
import java.math.BigDecimal;

/**
 *
 * @author rosap
 */
public class TipCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float amount=0;
String choice;

do{
System.out.println("Tip Calculator");
Scanner input = new Scanner(System.in);
Scanner myTip = new Scanner(System.in);
System.out.print("Cost of meal:$ ");
float cost = input.nextFloat();
BigDecimal Bd1 =
new BigDecimal(cost);
System.out.println("15%");
float tipamount=cost*15/100;
System.out.println("Tip amount="+ tipamount);
BigDecimal Bd2 =
new BigDecimal(tipamount);
BigDecimal C = Bd1.add(Bd2);
System.out.println("Total amount :"+ C+"\n");
System.out.println("20%");
float tipamount1=cost*20/100;
System.out.println("Tip amount:"+ tipamount1);
BigDecimal Bd3 = new BigDecimal(tipamount1);
BigDecimal C1 = Bd1.add(Bd3);
System.out.println("Total amount :"+ C1+"\n");
System.out.println("25%");
float tipamount2=cost*25/100;
System.out.println("Tip amount:"+ tipamount2);
BigDecimal bd4 = new BigDecimal(tipamount2);
BigDecimal C2 = Bd1.add(bd4);
System.out.println("Total amount:"+ C2+"\n");
System.out.println("Continue (Y/N) ?\n");

choice = myTip.nextLine();
}while((choice=="Y")||(choice=="y"));
    }
    
}
