//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MainLuis {
//    public static void main(String[] args) {
//
//        System.out.println("Hello, world.");
//
//        System.out.println();
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Welcome to the name list challenge! Please, enter your name: ");
//        String name = scan.nextLine();
//
//        System.out.println();
//
//        System.out.print("Do you agree to have your name added to the list? Enter 1 for \"yes\" or enter 2 for \"no\". ");
//        int allowedToAdd = scan.nextInt();
//
//        System.out.println();
//
//        if (allowedToAdd == 1) {
//            System.out.println("Name added to the list.");
//
//            System.out.println();
//
//        } else if (allowedToAdd == 2) {
//            System.out.println("Name not added to the list.");
//
//            System.out.println();
//
//        } else {
//            System.out.println("Invalid answer.");
//
//            System.out.println();
//        }
//
//        ArrayList<String> listOfNames = new ArrayList<>();
//        int option;
//
//        System.out.println("Enter the digit of the desired option: ");
//
//        do {
//            System.out.print("""
//                1 - Add name
//                2 - List names
//                3 - Remove name
//                4 - Quit
//
//                """);
//            scan.nextInt();
//
//
//        }
//
//        option = scan.nextInt();
//    }
//}

import java.util.ArrayList;
import java.util.Scanner;

public class MainLuis {
    public static void main(String[] args) {

        System.out.println("Hello, world");

        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int option;

        do {
            System.out.println("""
            ==== Menu ====
            1 - Add name
            2 - List names
            3 - Remove name
            0 - Quit
            """);
            System.out.print("Choose the option: ");

            while (!scan.hasNextInt()) {
                System.out.println("Invalid input! Please enter only numbers.");
                scan.next();
                System.out.print("Choose the option: ");
            }

            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = scan.nextLine();
                    names.add(name);
                    System.out.println("Name added!");
                    break;

                case 2:
                    if (names.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Names on the list:");
                        for (int i = 0; i < names.size(); i++) {
                            System.out.println(i + " - " + names.get(i));
                        }
                    }
                    break;

                case 3:
                    if (names.isEmpty()) {
                        System.out.println("The list is empty, nothing to remove.");
                    } else {
                        System.out.print("Enter the index of the name to remove: ");

                        while (!scan.hasNextInt()) {
                            System.out.println("Invalid input! Please enter only numbers.");
                            scan.next();
                            System.out.print("Enter the index of the name to remove: ");
                        }

                        int index = scan.nextInt();
                        scan.nextLine();

                        if (index >= 0 && index < names.size()) {
                            String removed = names.remove(index);
                            System.out.println("Name \"" + removed + "\" successfully removed!");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Closing the program...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }

        } while (option != 0);

        scan.close();
    }
}