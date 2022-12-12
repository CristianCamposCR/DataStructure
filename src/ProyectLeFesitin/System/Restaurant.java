package ProyectLeFesitin.System;

import ProyectLeFesitin.Lists.DrinksCircularLinkedList;
import ProyectLeFesitin.Lists.MealDoblyCricularLinkedList;
import ProyectLeFesitin.Lists.TableLinkedListSimple;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in);
        int empelado;
        TableLinkedListSimple tables = new TableLinkedListSimple();
        DrinksCircularLinkedList listDrinks = new DrinksCircularLinkedList();
        MealDoblyCricularLinkedList listMeals = new MealDoblyCricularLinkedList();
        System.out.println("Tables");
        tables.printList();
        System.out.println("Drinks");
        listDrinks.printList();
        System.out.println("Meals");
        listMeals.printList();
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
