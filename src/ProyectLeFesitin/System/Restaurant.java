package ProyectLeFesitin.System;

import ProyectLeFesitin.Lists.DrinksCircularLinkedList;
import ProyectLeFesitin.Lists.MealDoblyCricularLinkedList;
import ProyectLeFesitin.Lists.TableLinkedListSimple;

public class Restaurant {
    public static void main(String[] args) {
        TableLinkedListSimple tables = new TableLinkedListSimple();
        DrinksCircularLinkedList listDrinks = new DrinksCircularLinkedList();
        MealDoblyCricularLinkedList listMeals = new MealDoblyCricularLinkedList();
        System.out.println("Tables");
        tables.printList();
        System.out.println("Drinks");
        listDrinks.printList();
        System.out.println("Meals");
        listMeals.printList();

    }
}
