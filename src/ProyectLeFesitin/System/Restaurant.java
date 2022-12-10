package ProyectLeFesitin.System;

import ProyectLeFesitin.Lists.DrinksCircularLinkedList;
import ProyectLeFesitin.Lists.TableLinkedListSimple;

public class Restaurant {
    public static void main(String[] args) {
        TableLinkedListSimple tables = new TableLinkedListSimple();
        DrinksCircularLinkedList listDrinks = new DrinksCircularLinkedList();
        tables.printList();

        listDrinks.printList();


    }
}
