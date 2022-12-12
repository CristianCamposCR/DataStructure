package ProyectLeFesitin.System;

import ProyectLeFesitin.Lists.*;
import model.Employ;
import model.Table;

import java.util.Scanner;

public class Restaurant {
    static TableLinkedListSimple tables = new TableLinkedListSimple();

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

        new ProductQueue().printQueueorder();

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

    }
