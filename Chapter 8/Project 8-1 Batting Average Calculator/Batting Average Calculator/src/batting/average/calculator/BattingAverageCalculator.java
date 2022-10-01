/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batting.average.calculator;

import java.text.NumberFormat;

/**
 *
 * @author rosap
 */
public class BattingAverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Console.displayLine("Welcome to the Batting Average Calculator");

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
// prompts user to enter number of times at bat and validates that the entry is a number

            int timesAtBat = Console.getInt("\nEnter number of times at bat: ", 1, 30);
            Console.displayLine("\n0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

// integer array that can store date for the number of times at bat
            int[] results = new int[timesAtBat];
            double baseHits = 0.0;
            double totalBases = 0.0;

// for loop that cycles through each index and asks for the at-bat results
            for (int i = 0; i < timesAtBat; i++) {
                int resultEntry = Console.getInt("Result for at-bat " + (i + 1) + ": ", 0, 4);
                results[i] = resultEntry;
            }

            for (int result : results) {
                if (result > 0) {
                    baseHits++;
                }
                totalBases += result;
            }

// calculate averages then print them and ask if the user wants to continue
            double battingAvg = (baseHits / timesAtBat);

//number of bases divided by times at bat is slug percentage
            double sluggingPercent = (totalBases / timesAtBat);

            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMinimumFractionDigits(3);

            String battingAvgString = number.format(battingAvg);
            String sluggingPercentString = number.format(sluggingPercent);

            Console.displayLine("\nBatting average: " + battingAvgString);
            Console.displayLine("Slugging percent: " + sluggingPercentString);

            choice = Console.getString("\nAnother player? (y/n): ", "y", "n");

        }
        Console.displayLine("\nBye!");

    }

}
