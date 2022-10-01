/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact.list;

import java.util.Scanner;

/**
 *
 * @author rosap
 */
public class Contact {

    Scanner sc = new Scanner(System.in);

    private String firstname;
    private String lastname;
    private String email;
    private String phone;

    public String getFirstName(String prompt) {
        System.out.print(prompt);
        String fn = sc.next();
        sc.nextLine();
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName(String prompt) {
        System.out.print(prompt);
        String ln = sc.next();
        sc.nextLine();
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail(String prompt) {
        System.out.print(prompt);
        String e = sc.next();
        sc.nextLine();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone(String prompt) {
        System.out.print(prompt);
        String ph = sc.next();
        sc.nextLine();
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String displayContact() {

        String contact = "----------------------------------------\n";
               contact += "---------Current Contact-----------------\n";
               contact += "-----------------------------------------)\n";
               contact += "Name: " + firstname + " " + lastname "\n";
               contact += "Email Address: " + email "\n";
               contact += "Phone Number: " + phone "\n";
               return contact;

    }

}
