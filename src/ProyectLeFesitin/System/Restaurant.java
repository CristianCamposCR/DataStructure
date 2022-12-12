package ProyectLeFesitin.System;

import ProyectLeFesitin.Lists.*;
import model.*;

import java.util.Scanner;

public class Restaurant {
    static TableLinkedListSimple tables = new TableLinkedListSimple();
    static MailboxStack mails = new MailboxStack();

    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in).useDelimiter("\n");
        int repeat = -1, system = -1, sendOrder = 1, somethingElse = -1;
        float total=0;
        DrinksCircularLinkedList listDrinks = new DrinksCircularLinkedList();
        MealDoblyCricularLinkedList listMeals = new MealDoblyCricularLinkedList();
        OrderQueue orderQueue = new OrderQueue();

      /*  System.out.println("Tables");
        tables.printList();
        System.out.println("Drinks");
        listDrinks.printList();
        System.out.println("Meals");
        listMeals.printList();
        System.out.println("Waiter");
        listEmploy.printList();*/
        //new ProductQueue().printQueueorder();
        do {
            System.out.println("---------------------------------\nWelcome to LE FESTIN\n------------------------------");
            Employ employ = chooseEmploy();
            System.out.println("You are : " + employ.getName());
            System.out.println();
            System.out.println("Choose the table to attend");
            Table table = chooseTable();
            table.setAvailable(false);
            System.out.println("Enter customer name");
            User user = new User(escanner.next());
            do {

                System.out.println("would you like something to drink");
                System.out.println("1. yes");
                System.out.println("2. not");
                if ("1".equals(escanner.next())){
                    do {
                        System.out.println("Choose a drink");
                        System.out.println("enter -1 to choose nothing");
                        Drinks drink = choooseDrink();
                        table.getOrders().enqueue(drink);
                        repeat = otherDrink();
                    }while (repeat != -1);
                }
                do {
                    System.out.println("Choose a meal");
                    Meal meal = choooseMeal();
                    table.getOrders().enqueue(meal);
                    repeat = otherMeal();
                }while (repeat != -1);
                System.out.println("the current order is:");
                table.getOrders().printQueueorder();
                System.out.println("would you like to send the order?");
                switch (sendOrder()){
                    case 1:
                        orderQueue.setFront(table.getOrders().getFront());
                        table.getOrders().cleanQueue();
                        System.out.println("order going out");
                        total += orderQueue.clean();
                        System.out.println("would you like something else?");
                        somethingElse = somethingElse();
                        break;
                    case 2:
                        //romper
                        table.getOrders().cleanQueue();
                        System.out.println("The whole order was canceled");
                        system = -1;
                        break;

                }
            }while (somethingElse != -1);
            System.out.println("Total to pay: " + total);
            if (total != 0){
                user.setPayment( paymentMethod());
                System.out.println(user.getName() + "'s account has been paid successfully");
                table.setAvailable(true);
                total = 0;
            }else {
                table.setAvailable(true);
                total = 0;
            }



            //tables.printList();
        }while (system == -1);

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

    public static Drinks choooseDrink(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        DrinksCircularLinkedList listDrinks = new DrinksCircularLinkedList();
        listDrinks.printList();
        System.out.println("Enter number of drink");
        try {
            return listDrinks.searchByPosition(scanner.nextInt());
        }catch (Exception e){
            System.out.println();
            System.out.println("Error You should enter a existent number!!");
            return choooseDrink();
        }
    }

    public static int otherDrink(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int repeat =-1;
        System.out.println("other drink?");
        System.out.println("1.- yes");
        System.out.println("2.- not");
        try {
            repeat = scanner.nextInt();
            switch (repeat){
                case 1:
                    repeat = 1;
                    break;
                case 2:
                    repeat = -1;
                    break;
                default:
                    break;
            }
        }catch (Exception e){
            System.out.println("Error You should enter a existent number!!");
            return otherDrink();
        }
        return repeat;
    }

    public static Meal choooseMeal(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        MealDoblyCricularLinkedList listMeals = new MealDoblyCricularLinkedList();
        listMeals.printList();
        System.out.println("Enter number of meal");
        try {
            return listMeals.searchByPosition(scanner.nextInt());
        }catch (Exception e){
            System.out.println();
            System.out.println("Error You should enter a existent number!!");
            return choooseMeal();
        }
    }

    public static int otherMeal(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int repeat =-1;
        System.out.println("other meal?");
        System.out.println("1.- yes");
        System.out.println("2.- not");
        try {
            repeat = scanner.nextInt();
            switch (repeat){
                case 1:
                    repeat = 1;
                    break;
                case 2:
                    repeat = -1;
                    break;
                default:
                    break;
            }
        }catch (Exception e){
            System.out.println("Error You should enter a existent number!!");
            return otherMeal();
        }
        return repeat;
    }

    public static int sendOrder(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int repeat =-1;
        System.out.println("would you like to send the order?");
        System.out.println("1.- yes");
        System.out.println("2.- not");
        try {
            repeat = scanner.nextInt();
            switch (repeat){
                case 1:
                    repeat = 1;
                    break;
                case 2:
                    repeat = 2;
                    break;
                default:
                    break;
            }
        }catch (Exception e){
            System.out.println("Error You should enter a existent number!!");
            return sendOrder();
        }
        return repeat;
    }

    public static int somethingElse(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int repeat =-1;
        System.out.println("would you like something else?");
        System.out.println("1.- yes");
        System.out.println("2.- not");
        try {
            repeat = scanner.nextInt();
            switch (repeat){
                case 1:
                    repeat = 1;
                    break;
                case 2:
                    repeat = -1;
                    break;
                default:
                    System.out.println("Error You should enter a existent number!!");
                    return somethingElse();
            }
        }catch (Exception e){
            System.out.println("Error You should enter a existent number!!");
            return somethingElse();
        }
        return repeat;
    }
    public static String paymentMethod(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int repeat =-1;
        System.out.println("enter the payment method");
        System.out.println("1.- cash");
        System.out.println("2.- card");
        try {
            repeat = scanner.nextInt();
            switch (repeat){
                case 1:
                    return "cash";
                case 2:
                    return "card";
                default:
                    System.out.println("Error You should enter a existent number!!");
                    return paymentMethod();
            }
        }catch (Exception e){
            System.out.println("Error You should enter a existent number!!");
            return paymentMethod();
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
