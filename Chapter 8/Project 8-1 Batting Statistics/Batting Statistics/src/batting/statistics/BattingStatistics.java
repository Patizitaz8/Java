/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batting.statistics;
import java.io.*;

/**
 *
 * @author rosap
 */
public class BattingStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String anotherPlayer = "y";

    while(anotherPlayer.equalsIgnoreCase("y")) {
        int numAtBats; 
        
        while(true) {
               System.out.print("Enter number of times at bat: ");
                numAtBats = Integer.parseInt(br.readLine());
                if(numAtBats >= 1 && numAtBats <= 30) { 
                    break;
                }
                else {
                       System.out.println("Please enter an integer between 1 (inclusive) and 30 (inclusive).");
                }
            }

            int[] atBat = new int[numAtBats]; 
            System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

            for(int i=0;i<numAtBats;i++) {

                while(true) {
                    System.out.print("Result for at-bat " + (i + 1) + ": ");
                    int val = Integer.parseInt(br.readLine());
                    if(val >= 0 && val <= 4) { 
                        atBat[i] = val;
                        break;
                    }
                    else {
                        System.out.println("Please enter an integer between 0 (inclusive) and 4 (inclusive).");
                    }
                }
            }

            int numAtleastBaseSum = 0;
            int numBaseSum = 0;
            for(int i=0;i<numAtBats;i++) {
                if(atBat[i] > 0) {
                    numAtleastBaseSum ++; 
                }
                numBaseSum += atBat[i]; 
            }

            Double batAvg = Double.valueOf(numAtleastBaseSum) / Double.valueOf(numAtBats); 
            Double slugPercent = Double.valueOf(numBaseSum) / Double.valueOf(numAtBats); 
            System.out.println("Batting average: " + String.format("%.3f", batAvg)); 
            System.out.println("Slugging percent: " + String.format("%.3f", slugPercent));

            System.out.print("Another player? (y/n): "); 
            anotherPlayer = br.readLine();
            System.out.print("Bye!");
        }
    }
    
}
