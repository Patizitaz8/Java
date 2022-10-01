/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contact.list;

import java.util.Scanner;

/**
 *
 * @author rosap
 */
public class ContactList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Contact List application");
        System.out.println();

        String Choice = "y";

        Contact contact = new Contact();

        while (Choice.equalsIgnoreCase("y")) {

            String firstname = contact.getFirstName("Enter first name: ");
            contact.setFirstName(firstname);

            String lastname = contact.getLastName("Enter last name: ");
            contact.setLastName(lastname);

            String email = contact.getEmail("Enter email: ");
            contact.setEmail(email);

            String phone = contact.getPhone("Enter phone: ");
            contact.setPhone(phone);

            System.out.println("Continue? y/n ");
            Choice = sc.next();

        }

        System.out.println(contact.displayContact());
    }
}
