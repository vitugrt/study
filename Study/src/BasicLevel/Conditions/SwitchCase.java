package src.Conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
        * Servem para validar casos especificos
        * Objetivo: fazer com que o usuario tenha o poder de escolha
        *
        * */

        //Perguntar qual a escolha
        Scanner escolha = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 3");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        //Guardar a escolha
        int escolhaDoUsuario = escolha.nextInt();

        System.out.println("Você digitou " + escolhaDoUsuario + " e vai prosseguir");

        //Reação a escolha
        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Número inválido, tente novamente");
                break;
        }
        escolha.close();
    }
}
