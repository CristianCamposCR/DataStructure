package ProyectLeFesitin.System;

import ProyectLeFesitin.Lists.DrinksCircularLinkedList;
import ProyectLeFesitin.Lists.EmployDoublyLinkedList;
import ProyectLeFesitin.Lists.MealDoblyCricularLinkedList;
import ProyectLeFesitin.Lists.TableLinkedListSimple;
import model.Employ;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in);
        int empelado;
        TableLinkedListSimple tables = new TableLinkedListSimple();
        DrinksCircularLinkedList listDrinks = new DrinksCircularLinkedList();
        MealDoblyCricularLinkedList listMeals = new MealDoblyCricularLinkedList();
        EmployDoublyLinkedList listEmploy = new EmployDoublyLinkedList();
        System.out.println("Tables");
        tables.printList();
        System.out.println("Drinks");
        listDrinks.printList();
        System.out.println("Meals");
        listMeals.printList();
        System.out.println("Waiter");
        listEmploy.printList();

        System.out.println("---------------------------------\nWelcome to LE FESTIN\n------------------------------");


        listEmploy.printList();
        System.out.println("Enter you number of employ ->");


        Employ employ = listEmploy.searchByPosition(escanner.nextInt());

        System.out.println("You are : " + employ.getName());






        switch (menu()) {
            case 1:
                System.out.println("si jalo");
                break;
            default:
                System.out.println("Invalido");
                break;
        }

    }


    public static int menu() {
        Scanner escanner = new Scanner(System.in);
        int empleado = -1;
        System.out.println("Bienvenido");
        System.out.println("Lsita de empleados");
        //listemployees.printList

        System.out.println("Selecciona el empleado que eres");
        try {
            empleado = escanner.nextInt();
        } catch (Exception e) {
            System.out.println("Recuerda que solo debes ingresar el numero que le corresponde");
            return menu();
        }
        return empleado;
    }
}
