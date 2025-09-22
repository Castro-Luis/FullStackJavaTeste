import java.util.ArrayList;
import java.util.Scanner;

public class MainLuis {
    public static void main(String[] args) {

        System.out.println("Hello, world.");

        System.out.println();

        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to the name list challenge! Please, enter your name: ");
        String name = scan.nextLine();

        System.out.println();

        System.out.print("Do you agree to have your name added to the list? Enter 1 for \"yes\" or enter 2 for \"no\". ");
        int allowedToAdd = scan.nextInt();

        System.out.println();

        if (allowedToAdd == 1) {
            System.out.println("Name added to the list.");

            System.out.println();

        } else if (allowedToAdd == 2) {
            System.out.println("Name not added to the list.");

            System.out.println();

        } else {
            System.out.println("Invalid answer.");
            // Achar um comando de encerrar o código
        }

        ArrayList<String> listOfNames = new ArrayList<>();
        int option;

        System.out.println("Enter the digit of the desired option: ");

        System.out.print("""
                1 - Add name
                2 - List names
                3 - Remove name
                4 - Quit
                
                """);

        option = scan.nextInt();
    }
}