package src.Challenges;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {

        java.util.Scanner option = new  java.util.Scanner(System.in);

        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Login Ninja");
        System.out.println("2. Logged Ninjas");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        int userOption = option.nextInt();

        switch(userOption) {
            case 1:
                Scanner name = new Scanner(System.in);
                System.out.println("Ninja's name:");
                String nameNinja = name.nextLine();
                String[] strings = new String[6];
                System.out.println("Ninja's age:");
                Scanner number = new Scanner(System.in);
                int numberNinja = number.nextInt();
                int[] ninja = new int[numberNinja];
                System.out.println("Ninja successfully logged!");
                break;
            case 2:

                break;

            case 3:
                    System.out.println("You choose to exit");
                break;

            default:
                System.out.println("Not a valid option");
                break;

            //option.close();
        }
    }
}
