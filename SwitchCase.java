package src.Conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        //choose an option
        Scanner escolha = new Scanner(System.in);
        System.out.println("Choose from 1 to 3");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        //Guardar a escolha
        int userChoose = escolha.nextInt();

        System.out.println("You typed " + userChoose + " and will proceed");

        switch (userChoose){
            case 1:
                System.out.println("you have chosen naruto");
                break;
            case 2:
                System.out.println("you have chosen sasuke");
                break;
            case 3:
                System.out.println("you have chosen sakura");
                break;
            default:
                System.out.println("not a valid option");
                break;
        }
        escolha.close();
    }
}
