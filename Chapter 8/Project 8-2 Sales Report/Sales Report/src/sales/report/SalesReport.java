/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sales.report;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author rosap
 */
public class SalesReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] sales = {
            {1540.0, 2010.0, 2450.0, 1845.0},//region1
            {1130.0, 1168.0, 1847.0, 1491.0},//region2
            {1580.0, 2305.0, 2710.0, 1284.0},//region3
            {1105.0, 4102.0, 2391.0, 1576.0}};//region4

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(java.util.Locale.US);

        System.out.println("The sales report application: ");
        System.out.println("Region\tQ1\t\tQ2\t\tQ3\t\tQ4");
        for (int i = 0; i < sales.length; i++) {
            System.out.print(i + 1 + "\t");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(defaultFormat.format(sales[i][j]) + "\t");
            }
            System.out.println();
        }
        System.out.println("Sales by region: \n");
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Region " + (i + 1) + ":");
            double region_sale = 0;
            for (int j = 0; j < sales[i].length; j++) {
                region_sale += sales[i][j];
            }
            System.out.println(defaultFormat.format(region_sale));
        }
        System.out.println("\nSales by Quarter: \n");
        double q1 = 0;
        double q2 = 0;
        double q3 = 0;
        double q4 = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (j == 0) {
                    q1 += sales[i][j];
                }
                if (j == 1) {
                    q2 += sales[i][j];
                }
                if (j == 2) {
                    q3 += sales[i][j];
                }
                if (j == 3) {
                    q4 += sales[i][j];
                }
            }
        }
        System.out.println("Q1: " + defaultFormat.format(q1));
        System.out.println("Q2: " + defaultFormat.format(q2));
        System.out.println("Q3: " + defaultFormat.format(q3));
        System.out.println("Q4: " + defaultFormat.format(q4));

        double total_sales = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total_sales += sales[i][j];
            }
        }
        System.out.println("\nTotal Sales: " + defaultFormat.format(total_sales));
    }

}
