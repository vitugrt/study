package Challenges;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        //user option
        Scanner scanner = new Scanner(System.in);

        //array and data
        int max_Number = 10;
        String[] ninjas = new String[max_Number];

        //contadores
        int loggedNinja = 0;
        int option = 0;

        while (option != 4){

        //menu
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Login Ninja");
        System.out.println("2. Logged Ninjas");
        System.out.println("3. Exit");
        //System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();
        scanner.nextLine();

        switch (option){
            case 1:
                if(loggedNinja < max_Number){
                    System.out.println("What's the name of the ninja?");
                    String ninjaName = scanner.nextLine();
                    ninjas[loggedNinja] = ninjaName;
                    loggedNinja ++;
                    System.out.println("Ninja logged successful");
                } else {
                    System.out.println("We run out of space!");
                }
                break;
            case 2:
                if (loggedNinja ==0){
                    System.out.println("Sorry, we don't have no one");
                } else {
                    System.out.println("===== Ninja's list =====");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(ninjas[i]);
                    }
                }
                break;
            /*case 3:

                break;*/

            case 3:
                System.out.println("You choose to exit. Bye!");

                break;
            default:
                System.out.println("Please, choose a valid option");
                break;
            }
        }
    }
}
