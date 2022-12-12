package ProyectLeFesitin.System;

import ProyectLeFesitin.Lists.*;
import model.Employ;
import model.MailBox;
import model.Table;

import java.util.Scanner;

public class Restaurant {
    static TableLinkedListSimple tables = new TableLinkedListSimple();
    static MailboxStack mails = new MailboxStack();

    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in).useDelimiter("\n");
        int empelado;
        DrinksCircularLinkedList listDrinks = new DrinksCircularLinkedList();
        MealDoblyCricularLinkedList listMeals = new MealDoblyCricularLinkedList();
      /*  System.out.println("Tables");
        tables.printList();
        System.out.println("Drinks");
        listDrinks.printList();
        System.out.println("Meals");
        listMeals.printList();
        System.out.println("Waiter");
        listEmploy.printList();*/

        sendMailBox();

        System.out.println("---------------------------------\nWelcome to LE FESTIN\n------------------------------");

        Employ employ = chooseEmploy();
        System.out.println("You are : " + employ.getName());
        System.out.println();
        System.out.println("Choose the table to attend");
        Table table = chooseTable();
        table.setAvailable(false);
        tables.printList();


    }


    public static Employ chooseEmploy() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        EmployDoublyLinkedList listEmploy = new EmployDoublyLinkedList();
        listEmploy.printList();
        System.out.println("Enter you number of employ ->");
        try {
            return listEmploy.searchByPosition(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Error You should enter a existent number!!");
            return chooseEmploy();
        }
    }

    public static Table chooseTable() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        tables.printList();
        System.out.println("Enter number of table ->");
        try {
            return tables.searchByPosition(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Error You should enter a existent number!!");
            return chooseTable();
        }
    }

    public static void sendMailBox() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        mails.setCount(mails.getCount()+1);
        int count = mails.getCount();
        MailBox mailBox = new MailBox();
        System.out.println("Hello and thanks for helping to better the software");
        System.out.println("Enter your name or write anonimous: ");
        mailBox.setFrom(scanner.next());
        System.out.println("Enter the subject: ");
        mailBox.setSubject(scanner.next());
        System.out.println("Enter the text");
        mailBox.setBody(scanner.next());
        mailBox.setId(count);
        mails.push(mailBox);

    }

}
