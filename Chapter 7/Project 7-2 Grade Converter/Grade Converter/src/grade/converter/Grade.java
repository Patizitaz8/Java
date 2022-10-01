/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grade.converter;

import java.util.Scanner;

/**
 *
 * @author rosap
 */
public class Grade {

    int grade;

    public void setNumber(int number) {
        grade = number;
    }

    public int getNumber() {
        return grade;
    }

    public String getLetter() {

        if (grade > 88) {
            return "A";
        }

        if (grade > 80) {
            return "B";
        }

        if (grade > 67) {
            return "C";
        }

        if (grade > 60) {
            return "D";
        }

        return "F";
    }

    Grade() {
        grade = 0;
    }

    Grade(int number) {
        grade = number;
    }

}
