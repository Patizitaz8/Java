/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contact.list;
import java.util.Scanner;
import java.io.Console;


/**
 *
 * @author rosap
 */
public class ContactList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
Console c = System.console();
System.out.println("Welcome to the Contact List application");
System.out.println("");

char choice;

do{
System.out.print("Enter first name: ");
String name = c.readLine();

System.out.print("Enter last name: ");
String last = c.readLine();

System.out.print("Enter email: ");
String email = c.readLine();

System.out.print("Enter phone: ");
String phone = c.readLine();

System.out.println("");

Contact print = new Contact(name, last, email, phone);

print.displayContact();


System.out.println("----------------------------------------\n"
+ "---------Current Contact-----------------\n" + "-----------------------------------------");

System.out.println("-----------------------------------");

System.out.println("");

System.out.print("Continue? (y/n): ");

choice = input.next().charAt(0);

System.out.println("");
}
while (choice == 'y' || choice == 'Y');
{
input.close();

}

}
}

class Contact{

private String firstname;
private String lastname;
private String email;
private String phone;

public Contact(String firstname, String lastname, String email, String phone){
this.firstname = firstname;
this.lastname = lastname;
this.email = email;
this.phone = phone;
}

public void setFirstName(String name)
{
this.firstname = name;
}

public String getFirstName()
{
return this.firstname;
}

public void setLastName(String name)
{
this.lastname = name;
}

public String getLastName()
{
return this.lastname;
}

public void setEmail(String email)
{
this.email = email;
}

public String getEmail()
{
return this.email;
}

public void setPhone(String phone)
{
this.phone = phone;
}

public String getPhone()
{
return this.phone;
}

public void displayContact()
{
System.out.println("Current Contact");

System.out.println("Name: " + getFirstName() + " " + getLastName());

System.out.println("Email Address: " + getEmail());

System.out.println("Phone Number: " + getPhone());
    }
    
}
