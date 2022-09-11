/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grade.converter;
import java.util.*;

/**
 *
 * @author rosap
 */
class Grade {

    int grade;

public void setNumber(int number) {
    grade = number;
}

public int getNumber() {
    return grade;
}

public String getLetter() {

    if (grade > 88)
    return "A";

    if (grade > 80)
    return "B";

    if (grade > 67)
    return "C";

    if (grade > 60)
    return "D";

    return "F";
}

Grade() {
    grade = 0;
}

Grade(int number) {
    grade = number;
}

}

class Console {
    Scanner sc = new Scanner(System.in);

public int get_number() {

    System.out.print("Enter numerical grade: ");

        if (sc.hasNextInt()) {

        int number = sc.nextInt();

        sc.nextLine();

        return number;
}

sc.nextLine();

System.out.println("Error! Invalid integer. Try again.");

return get_number();

}

public String get_choice() {

    System.out.print("Continue? (y/n): ");

    String choice = sc.nextLine();

        if (choice.equals("y") || choice.equals("n")) {

        return choice;
}

    if (choice.equals("")) {

    System.out.println("Error! This entry is required. Try again.");

    return get_choice();
}

System.out.println("Error! Entry must be 'y' or 'n'. Try again.");

return get_choice();

}

}
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

    if (choice.equals("n"))

    break;
}
    }
    
}
